package io.github.com.pages.utils;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.material.elements.inputs.Checkbox;
import com.epam.jdi.light.material.elements.utils.Transition;


import java.util.List;

public class TransitionPage extends WebPage {

    @UI("//h2[text()='Grow']/following::div[contains(@class,'MuiPaper-root')]")
    public static List<Transition> growSlideTransitions;

    @UI("//h2[text()='Zoom']/following::div[contains(@class,'MuiPaper-root')]")
    public static List<Transition> zoomTransitions;

    @UI("//h1[text()='Transitions']/following::div[contains(@class,'MuiCollapse-container')]")
    public static List<Transition> collapseFadeTransitions;

    @UI("//span[contains(@class, 'MuiSwitch-switchBase')]")
    public static List<Checkbox> checkboxes;
}
