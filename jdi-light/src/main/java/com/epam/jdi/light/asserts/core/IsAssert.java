package com.epam.jdi.light.asserts.core;

import com.epam.jdi.light.asserts.generic.ITextAssert;
import com.epam.jdi.light.asserts.generic.SelectedAssert;
import com.epam.jdi.light.asserts.generic.UIAssert;
import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.common.UIElement;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import static com.epam.jdi.light.asserts.core.SoftAssert.jdiAssert;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by Roman Iovlev on 26.09.2019
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */
public class IsAssert extends UIAssert<IsAssert, UIElement>
        implements SelectedAssert<IsAssert>, ITextAssert<IsAssert> {
    @JDIAction("Assert that '{name}' text {0}")
    public IsAssert text(Matcher<String> condition) {
        jdiAssert(element.getText(), condition);
        return this;
    }
    /**
     * Match passed value with the element tag
     * @param condition to compare
     */
    @JDIAction("Assert that '{name}' tag {0}")
    public IsAssert tag(Matcher<String> condition) {
        jdiAssert(element.getTagName(), condition);
        return this;
    }
    public IsAssert tag(String tagName) {
        return tag(Matchers.is(tagName));
    }

    /**
     * Match passed value with the element class
     * @param condition to compare
     */
    @JDIAction("Assert that '{name}' css class {0}")
    public IsAssert cssClass(Matcher<String> condition) {
        jdiAssert(element.getAttribute("class"), condition);
        return this;
    }
    public IsAssert cssClass(String className) {
        return cssClass(Matchers.is(className));
    }

    /**
     * Check that the element is selected
     */
    @JDIAction("Assert that '{name}' is selected")
    public IsAssert selected() {
        jdiAssert(element.isSelected() ? "selected" : "not selected", Matchers.is("selected"));
        return this;
    }

    /**
     * Check that the element is deselected
     */
    @JDIAction("Assert that '{name}' is deselected")
    public IsAssert deselected() {
        jdiAssert(element.isDeselected() ? "not selected" : "selected", Matchers.is("not selected"));
        return this;
    }

}
