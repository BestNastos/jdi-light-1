package com.epam.jdi.light.material.elements.inputs;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.common.TextTypes;
import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.complex.dropdown.DropdownExpand;
import com.epam.jdi.light.elements.interfaces.complex.IsDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.objects.FillFromAnnotationRules;
import com.epam.jdi.light.material.asserts.inputs.SelectAssert;
import com.epam.jdi.light.material.interfaces.base.CanBeDisabled;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;

import java.lang.reflect.Field;

import static com.epam.jdi.light.common.TextTypes.INNER;

/**
 * To see an example of Select web element please visit
 * https://mui.com/components/selects/
 */

public class Select extends DropdownExpand implements CanBeDisabled {
    private final String list = ".MuiPopover-root ul li";
    private final String value = ".MuiSelect-nativeInput";
    private final String expand = "*";

    @Override
    public WebList list() {
        WebList l = linkedList(listLocator, "list").setUIElementName(INNER);
        l.setParent(null);
        return l;
    }

    @JDIAction("Close '{name}'")
    @Override
    public void close() {
        if (isExpanded()) {
            core().sendKeys(Keys.ESCAPE);
        }
    }

    @JDIAction("Select '{0}' in '{name}'")
    public void select(String... value) {
        expand();
        list().select(value);
        if (autoClose) {
            close();
        }
    }

    @JDIAction("Get selected value")
    @Override
    public String selected() {
        return text();
    }

    @Override
    public String getText() {
        return value().text(TextTypes.VALUE);
    }

    @Override
    public String text() {
        return core().text();
    }

    @Override
    public void setup(Field field) {
        if (!FillFromAnnotationRules.fieldHasAnnotation(field, JDropdown.class, IsDropdown.class)) {
            return;
        }
        JDropdown j = field.getAnnotation(JDropdown.class);
        String l = j.list().isEmpty() ? list : j.list();
        String v = j.value().isEmpty() ? value : j.value();
        String e = j.expand().isEmpty() ? expand : j.expand();
        setup(j.root(), v, l, e);
        autoClose = j.autoClose();
    }

    @Override
    public SelectAssert is() {
        return (SelectAssert) new SelectAssert().set(this);
    }

}
