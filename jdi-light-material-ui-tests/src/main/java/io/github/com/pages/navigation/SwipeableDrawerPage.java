package io.github.com.pages.navigation;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.material.elements.navigation.Drawer;
import com.epam.jdi.light.ui.html.elements.common.Button;

import java.util.List;

public class SwipeableDrawerPage extends WebPage {

    @UI("//*[text()='left']")
    public static Button leftButton;

    @UI("//*[text()='right']")
    public static Button rightButton;

    @UI("//*[text()='top']")
    public static Button topButton;

    @UI("//*[text()='bottom']")
    public static Button bottomButton;

    @UI("//div[contains(@class,'MuiPaper-root')]")
    public static Drawer drawer;

    @UI("//ul[contains(@class,'MuiList-padding')]//div[@class='MuiListItemText-root']/span")
    public static List<Button> drawerElementsText;

    @UI("//ul[contains(@class,'MuiList-padding')]//div[@class='MuiListItemIcon-root']")
    public static List<Drawer> drawerElementsIcon;

}