package com.epam.jdi.light.vuetify.elements.complex;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.base.UIListBase;
import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.ISetup;
import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.vuetify.annotations.JDIPagination;
import com.epam.jdi.light.vuetify.asserts.PaginationAssert;

import java.lang.reflect.Field;
import java.util.NoSuchElementException;

import static com.epam.jdi.light.elements.init.UIFactory.$;
import static com.epam.jdi.light.elements.init.UIFactory.$$;
import static com.epam.jdi.light.elements.pageobjects.annotations.objects.FillFromAnnotationRules.fieldHasAnnotation;

/**
 * To see an example of Pagination web element please visit
 * https://vuetifyjs.com/en/components/paginations/
 */
public class Pagination extends UIListBase<PaginationAssert> implements ISetup {

    protected String CORE_CLASS_DISABLED = "v-pagination--disabled";
    protected String ITEM_CLASS_SELECTED = "v-pagination__item--active";

    protected String ROOT_LOCATOR = ".v-pagination";
    protected String ITEMS_LOCATOR = ".v-pagination__item";
    protected String LEFT_NAVIGATION_LOCATOR = ".v-pagination__navigation[1]";
    protected String RIGHT_NAVIGATION_LOCATOR = ".v-pagination__navigation[2]";
    protected String MORE_ITEMS_LOCATOR = ".v-pagination__more";

    protected int startIndex = 1;
    protected Boolean next;
    protected Boolean previous;

    @Override
    @JDIAction("Get web list of all buttons from '{name}'")
    public WebList list() {
        return $$(ITEMS_LOCATOR, this).setName(getName() + " pagination");
    }

    @JDIAction("Get left navigation button from '{name}'")
    public UIElement leftNavigation() {
        return core().find(LEFT_NAVIGATION_LOCATOR);
    }

    @JDIAction("Get right navigation button from '{name}'")
    public UIElement rightNavigation() {
        return core().find(RIGHT_NAVIGATION_LOCATOR);
    }

    @Override
    @JDIAction("Get start index from '{name}'")
    public int getStartIndex() {
        return startIndex;
    }

    @Override
    @JDIAction("Set start index '{0}' for '{name}'")
    public void setStartIndex(int i) {
        startIndex = i;
    }

    @Override
    @JDIAction("Get selected button from '{name}'")
    public String selected() {
        return list().stream()
                .filter(button -> button.hasClass(ITEM_CLASS_SELECTED))
                .findFirst()
                .map(UIElement::getText)
                .orElse(null);
    }

    @Override
    @JDIAction("Check if button from '{name}' by name '{0}' is selected")
    public boolean selected(String option) {
        return list().get(option).hasClass(ITEM_CLASS_SELECTED);
    }

    @Override
    @JDIAction("Check if button from '{name}' by index '{0}' is selected")
    public boolean selected(int index) {
        return list().get(index).hasClass(ITEM_CLASS_SELECTED);
    }

    @Override
    @JDIAction("Check if '{name}' is enabled")
    public boolean isEnabled() {
        return !core().hasClass(CORE_CLASS_DISABLED);
    }

    @JDIAction("Check if '{name}' is on start")
    public boolean isStart() {
        return leftNavigation().isDisabled();
    }

    @JDIAction("Check if pagination '{name}' is on end")
    public boolean isEnd() {
        return rightNavigation().isDisabled();
    }

    @JDIAction("Get number of hidden buttons in '{name}'")
    public int hiddenButtons() {
        return core().finds(MORE_ITEMS_LOCATOR).size();
    }

    @Override
    public PaginationAssert is() {
        return new PaginationAssert().set(this);
    }

    @JDIAction("Check if '{name}' has next page")
    public boolean hasNext() {
        if (next == null) {
            next = size() > 0;
        }
        return next;
    }

    @JDIAction("Check if '{name}' has previous page")
    public boolean hasPrevious() {
        if (previous == null) {
            previous = size() > 0;
        }
        return previous;
    }

    @JDIAction("Go to next page through next button in '{name}'")
    public String next() {
        if (isEnd()) {
            if (!next) {
                throw new NoSuchElementException("Can't find next element in " + getName());
            }
            next = false;
            return selected();
        }
        next = true;
        String current = selected();
        rightNavigation().click();
        return current;
    }

    @JDIAction("Go to previous page through previous button in '{name}'")
    public String previous() {
        if (isStart()) {
            if (!previous) {
                throw new NoSuchElementException("Can't find previous element in " + getName());
            }
            previous = false;
            return selected();
        }
        previous = true;
        String current = selected();
        leftNavigation().click();
        return current;
    }

    @Override
    public void setup(Field field) {
        if (fieldHasAnnotation(field, JDIPagination.class, Pagination.class)) {
            JDIPagination annotation = field.getAnnotation(JDIPagination.class);
            initializeLocators(annotation);
        }
        this.setCore(Pagination.class, $(ROOT_LOCATOR));
        this.setName(String.format("Pagination %s", field.getName()));
    }

    private void initializeLocators(JDIPagination annotation) {
        if (!annotation.root().isEmpty()) {
            ROOT_LOCATOR = annotation.root();
        }
        if (!annotation.items().isEmpty()) {
            ITEMS_LOCATOR = annotation.items();
        }
        if (!annotation.left().isEmpty()) {
            LEFT_NAVIGATION_LOCATOR = annotation.left();
        }
        if (!annotation.right().isEmpty()) {
            RIGHT_NAVIGATION_LOCATOR = annotation.right();
        }
        if (!annotation.more().isEmpty()) {
            MORE_ITEMS_LOCATOR = annotation.more();
        }
    }
}