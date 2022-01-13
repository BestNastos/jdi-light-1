package io.github.com.pages;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.vuetify.elements.complex.bars.ToolBar;

public class ToolBarsPage extends VuetifyPage {

    @UI("#backgroundToolbar")
    public static ToolBar backgroundToolbar;

    @UI("#collapseToolbar")
    public static ToolBar collapseToolbar;

    @UI("#denseToolbar")
    public static ToolBar denseToolbar;

    @UI("#extendedToolbar")
    public static ToolBar extendedToolbar;

    @UI("#floatingWithSearchToolbar")
    public static ToolBar floatingWithSearchToolbar;

    @UI("#contextActionToolbar")
    public static ToolBar contextActionToolbar;

    @UI("#flexibleAndCardToolbar")
    public static ToolBar flexibleAndCardToolbar;
}
