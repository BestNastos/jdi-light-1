package com.epam.jdi.light.elements.base;

/**
 * Created by Roman Iovlev on 14.02.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.interfaces.IHasValue;
import com.epam.jdi.light.elements.interfaces.ISetValue;
import org.openqa.selenium.*;

import java.util.List;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class UIElement extends JDIBase implements WebElement, ISetValue, IHasValue {

    @JDIAction
    public void click() {
        get().click();
    }
    public void submit() {
        get().submit();
    }
    @JDIAction("Input {value}")
    public void sendKeys(CharSequence... value) {
        get().sendKeys(value);
    }
    @JDIAction
    public void clear() {
        get().clear();
    }
    public String getTagName() {
        return get().getTagName();
    }
    @JDIAction
    public boolean isSelected() {
        return get().isSelected();
    }
    @JDIAction
    public boolean isEnabled() {
        return get().isEnabled();
    }
    @JDIAction
    public String getText() {
        WebElement el = get();
        String value = el.getAttribute("value");
        if (!isBlank(value))
            return value;
        String text = el.getText();
        return text != null ? text : value;
    }

    public List<WebElement> findElements(By by) {
        return get().findElements(by);
    }

    public WebElement findElement(By by) {
        return get().findElement(by);
    }

    @JDIAction
    public boolean isDisplayed() {
        WebElement el = getWebElement();
        try { return el != null && el.isDisplayed();
        } catch (Exception ex) { return false; }
    }
    public Point getLocation() {
        return get().getLocation();
    }
    public Dimension getSize() {
        return get().getSize();
    }
    public Rectangle getRect() {
        return get().getRect();
    }
    public String getCssValue(String s) {
        return get().getCssValue(s);
    }
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return get().getScreenshotAs(outputType);
    }
    public String getAttribute(String name) {
        return get().getAttribute(name);
    }
    public String getValue() {
        return getText();
    }
    @JDIAction
    public void select(String name) {
        get(name).click();
    }

    public void setValue(String value) {
        clear();
        sendKeys(value);
    }

}
