package com.epam.jdi.light.asserts;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.base.BaseUIElement;
import com.epam.jdi.light.elements.complex.ISelector;
import com.epam.jdi.tools.func.JFunc;
import org.hamcrest.Matcher;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.List;

import static com.epam.jdi.tools.LinqUtils.map;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ListAssert<T extends BaseUIElement> extends SelectAssert {
    JFunc<List<T>> elements;

    public ListAssert(JFunc<List<T>> elements, JFunc<ISelector> selector, String name) {
        super(() -> selector.execute().setName(name));
        this.elements = elements;
    }

    @JDIAction("Assert that all '{name}' texts {0}") @Override
    public ListAssert<T> texts(Matcher<Collection<? extends String>> condition) {
        assertThat(map(elements.execute(), WebElement::getText), condition);
        return this;
    }
    @JDIAction("Assert that all '{name}' attributes {0}") @Override
    public ListAssert<T> attrs(String attrName, Matcher<Collection<? extends String>> condition) {
        assertThat(map(elements.execute(), el -> el.getAttribute(attrName)), condition);
        return this;
    }
    @JDIAction("Assert that all '{name}' elements css '{0}' {1}") @Override
    public ListAssert<T> allCss(String css, Matcher<Collection<? extends String>> condition) {
        assertThat(map(elements.execute(), el -> el.getCssValue(css)), condition);
        return this;
    }
    @JDIAction("Assert that all '{name}' tags {0}") @Override
    public ListAssert<T> allTags(Matcher<Collection<? extends String>> condition) {
        assertThat(map(elements.execute(), WebElement::getTagName), condition);
        return this;
    }
    @JDIAction("Assert that '{name}' has css class {0}") @Override
    public ListAssert<T> hasCssClasses(String... classNames) {
        return cssClasses(hasItems(classNames));
    }
    @JDIAction("Assert that all '{name}' css classes {0}") @Override
    public ListAssert<T> cssClasses(Matcher<Iterable<String>> condition) {
        assertThat(map(elements.execute(), el -> el.getAttribute("class")), condition);
        return this;
    }
    @JDIAction("Assert that all '{name}' elements are displayed") @Override
    public ListAssert<T> allDisplayed() {
        assertThat(map(elements.execute(), BaseUIElement::isDisplayed), everyItem(is(true)));
        return this;
    }
    @JDIAction("Assert that at least one '{name}' element is displayed") @Override
    public ListAssert<T> displayed() {
        assertThat(map(elements.execute(), BaseUIElement::isDisplayed), hasItem(true));
        return this;
    }
    @JDIAction("Assert that all '{name}' elements are hidden") @Override
    public ListAssert<T> allHidden() {
        assertThat(map(elements.execute(), BaseUIElement::isDisplayed), everyItem(is(false)));
        return this;
    }
    @JDIAction("Assert that all '{name}' elements are selected") @Override
    public ListAssert<T> allSelected() {
        assertThat(map(elements.execute(), BaseUIElement::isSelected), everyItem(is(true)));
        return this;
    }
    @JDIAction("Assert that all '{name}' elements are enabled") @Override
    public ListAssert<T> allEnabled() {
        assertThat(map(elements.execute(), BaseUIElement::isEnabled), everyItem(is(true)));
        return this;
    }
}
