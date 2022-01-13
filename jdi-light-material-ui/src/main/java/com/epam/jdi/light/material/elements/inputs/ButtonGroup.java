package com.epam.jdi.light.material.elements.inputs;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.base.UIListBase;
import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.ISetup;
import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.material.annotations.JDIButtonGroup;
import com.epam.jdi.light.material.asserts.inputs.ButtonGroupAssert;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.stream.Collectors;

import static com.epam.jdi.light.elements.pageobjects.annotations.objects.FillFromAnnotationRules.fieldHasAnnotation;

/**
 * To see an example of Button group web element please visit
 * https://mui.com/components/button-group/
 */

public class ButtonGroup extends UIListBase<ButtonGroupAssert> implements ISetup {

    private static String BUTTON_FIND_STRATEGY = "button.MuiButtonBase-root";
    private static final String TEXT_FIND_PATTERN = "//*[text() = '%s']";

    @JDIAction("Get Button with index '{0}'")
    public MaterialButton getButtonByIndex(int index) {
        return castToButton(list().get(index));
    }

    @JDIAction("Get Button with text '{0}'")
    public MaterialButton getButtonByText(String text) {
        return castToButton(core().find(String.format(TEXT_FIND_PATTERN, text)));
    }

    @JDIAction("Get all Buttons from '{name}'")
    public Collection<MaterialButton> getAllButtons() {
        return list().stream()
                .map(this::castToButton)
                .collect(Collectors.toList());
    }

    private MaterialButton castToButton(UIElement element) {
        return new MaterialButton().setCore(MaterialButton.class, element);
    }

    @Override
    public void setup(Field field) {
        if (!fieldHasAnnotation(field, JDIButtonGroup.class, ButtonGroup.class)) {
            return;
        }
        JDIButtonGroup annotation = field.getAnnotation(JDIButtonGroup.class);
        BUTTON_FIND_STRATEGY = annotation.list();
    }

    @Override
    public WebList list() {
        return core().finds(BUTTON_FIND_STRATEGY);
    }

    @Override
    public ButtonGroupAssert is() {
        return new ButtonGroupAssert().set(this);
    }
}
