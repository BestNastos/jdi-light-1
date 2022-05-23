package io.github.com.custom.textfields;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.vuetify.elements.common.Icon;
import com.epam.jdi.light.vuetify.elements.complex.TextField;

import java.util.List;
import java.util.stream.Collectors;

public class IconTextField extends TextField {

    private static final String PREPEND_OUTER_ICON = ".v-input__prepend-outer";
    private static final String PREPEND_INNER_ICON = ".v-input__prepend-inner";
    private static final String APPEND_OUTER_ICON = ".v-input__append-outer";
    private static final String APPEND_INNER_ICON = "div:last-child.v-input__append-inner";
    private static final String CLEAR_ICON = ".v-input__append-inner";

    @JDIAction("Get '{name}' list icons by locator")
    protected List<Icon> iconsByLocator(String locator) {
        return finds(locator).stream().map(icon -> icon.find(".v-icon")).map(icon -> new Icon().setCore(Icon.class, icon)).collect(Collectors.toList());
    }

    @JDIAction("Get '{name}' icon by locator")
    protected Icon iconByLocator(String locator) {
        return new Icon().setCore(Icon.class, find(locator));
    }

    @JDIAction("Get '{name}' prepend outer icons")
    public List<Icon> prependOuterIcons() {
        return iconsByLocator(PREPEND_OUTER_ICON);
    }

    @JDIAction("Get '{name}' prepend inner icons")
    public List<Icon> prependInnerIcons() {
        return iconsByLocator(PREPEND_INNER_ICON);
    }

    @JDIAction("Get '{name}' append inner icons")
    public List<Icon> appendInnerIcons() {
        return iconsByLocator(APPEND_INNER_ICON);
    }

    @JDIAction("Get '{name}' append outer icons")
    public List<Icon> appendOuterIcons() {
        return iconsByLocator(APPEND_OUTER_ICON);
    }

    @JDIAction("Get '{name}' clear icons")
    public Icon clearIcon() {
        return iconByLocator(CLEAR_ICON);
    }

    @JDIAction("Get '{name}' prepend outer icon")
    public Icon prependOuterIcon() {
        return iconByLocator(PREPEND_OUTER_ICON);
    }

    @JDIAction("Get '{name}' prepend inner icons")
    public Icon prependInnerIcon() {
        return iconByLocator(PREPEND_INNER_ICON);
    }

    @JDIAction("Get '{name}' append inner icons")
    public Icon appendInnerIcon() {
        return iconByLocator(APPEND_INNER_ICON);
    }

    @JDIAction("Get '{name}' append outer icons")
    public Icon appendOuterIcon() {
        return iconByLocator(APPEND_OUTER_ICON);
    }
}
