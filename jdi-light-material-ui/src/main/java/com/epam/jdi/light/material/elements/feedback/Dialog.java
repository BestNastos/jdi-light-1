package com.epam.jdi.light.material.elements.feedback;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.base.UIBaseElement;
import com.epam.jdi.light.material.asserts.feedback.DialogAssert;
import com.epam.jdi.light.material.elements.displaydata.MUIList;
import com.epam.jdi.light.material.elements.inputs.ButtonGroup;
import com.epam.jdi.light.material.elements.inputs.RadioButtons;
import com.epam.jdi.light.material.elements.inputs.TextField;
import com.epam.jdi.light.ui.html.elements.common.Text;

import static com.epam.jdi.light.common.Exceptions.runtimeException;
import static com.epam.jdi.light.driver.WebDriverFactory.jsExecute;

/**
 * Represents dialog MUI component on GUI.
 *
 * @see <a href="https://mui.com/components/dialogs/">Dialog MUI documentation</a>
 * @see <a href="https://jdi-testing.github.io/jdi-light/material">MUI test page</a>
 */
public class Dialog extends UIBaseElement<DialogAssert> {

    /**
     * Script to find scrollable content.
     */
    private static final String EXECUTE_SCRIPT = "return arguments[0].scrollHeight > arguments[0].offsetHeight;";

    /**
     * Gets the title of this dialog.
     *
     * @return title of this dialog as {@link Text}
     */
    @JDIAction("Get '{name}' title")
    public Text title() {
        return new Text().setCore(Text.class, find(".MuiDialogTitle-root"));
    }

    /**
     * Gets the MUIList included in this dialog.
     *
     * @return MUIList of this dialog as {@link MUIList}
     */
    @JDIAction("Get '{name}' list items")
    public MUIList list() {
        return new MUIList().setCore(MUIList.class, find(".MuiList-root"));
    }

    /**
     * Gets the text content of this dialog.
     *
     * @return text of this dialog as {@link Text}
     */
    @JDIAction("Get '{name}' text content")
    public Text textContent() {
        return new Text().setCore(Text.class, find(".MuiDialogContentText-root"));
    }

    /**
     * Gets the buttons included in this dialog.
     *
     * @return buttons of this dialog as {@link ButtonGroup}
     */
    @JDIAction("Get '{name}' action buttons")
    public ButtonGroup actions() {
        return new ButtonGroup().setCore(ButtonGroup.class, find(".MuiDialogActions-root"));
    }

    /**
     * Gets the radiobuttons included in this dialog.
     *
     * @return radiobuttons of this dialog as {@link RadioButtons}
     */
    @JDIAction("Get '{name}' radio buttons")
    public RadioButtons radioButtons() {
        return new RadioButtons().setCore(RadioButtons.class, find(".MuiRadio-root"));
    }

    /**
     * Gets the text field included in this dialog.
     *
     * @return text field of this dialog as {@link TextField}
     */
    @JDIAction("Get '{name}' input field")
    public TextField input() {
        return new TextField().setCore(TextField.class, find(".MuiTextField-root"));
    }

    /**
     * Check that dialog has scrollable content.
     *
     * @return {@code true} if this dialog has scrollable content, otherwise {@code false}
     */
    @JDIAction("Check that '{name}' has scrollable content")
    public Boolean hasScrollableContent() {
        return jsExecute(EXECUTE_SCRIPT, find(".MuiDialogContent-root").getFast());
    }

    /**
     * Scroll dialog content to specified height.
     *
     * @param scrollHeight height to which the scrolling is performed
     */
    @JDIAction("Scroll '{name}' to target height")
    public void scrollContentTo(int scrollHeight) {
        jsExecute(String.format("arguments[0].scroll(0, %s)", scrollHeight), find(".MuiDialogContent-root").getFast());
    }

    /**
     * Check that dialog has scrollable body.
     *
     * @return {@code true} if this dialog has scrollable body, otherwise {@code false}
     */
    @JDIAction("Check that '{name}' has scrollable body")
    public Boolean hasScrollableBody() {
        return jsExecute(EXECUTE_SCRIPT, core().getFast());
    }

    /**
     * Scroll dialog body to specified height.
     *
     * @param scrollHeight height to which the scrolling is performed
     */
    @JDIAction("Scroll '{name}' to target height")
    public void scrollDialogBodyTo(int scrollHeight) {
        jsExecute(String.format("arguments[0].scroll(0, %s)", scrollHeight), core().getFast());
    }

    /**
     * Closes this dialog with 'close' button if it exists.
     */
    @JDIAction("Close '{name}' with 'close' button")
    public void close() {
        close("close");
    }

    /**
     * Closes this dialog with specified button.
     *
     * @param closeButtonName the name of the button to close the dialog
     */
    @JDIAction("Close '{name}' with {0} button")
    public void close(String closeButtonName) {
        actions().getAllButtons().stream()
                .filter(button -> button.getValue().equalsIgnoreCase(closeButtonName))
                .findFirst()
                .orElseThrow(() -> runtimeException(String.format("Close button %s not found", closeButtonName)))
                .click();
    }

    /**
     * Closes this dialog with 'ok' button if it exists.
     */
    @JDIAction("Confirm and close '{name}' with 'ok' button")
    public void confirm() {
        confirm("ok");
    }

    /**
     * Confirm and closes this dialog with specified button.
     *
     * @param confirmButtonName the name of the button to confirm and close the dialog
     */
    @JDIAction("Confirm and close '{name}' with {0} button")
    public void confirm(String confirmButtonName) {
        actions().getAllButtons().stream()
                .filter(button -> button.getValue().equalsIgnoreCase(confirmButtonName))
                .findFirst()
                .orElseThrow(() -> runtimeException(String.format("Confirm button %s not found", confirmButtonName)))
                .click();
    }

    @Override
    public DialogAssert is() {
        return new DialogAssert().set(this);
    }
}
