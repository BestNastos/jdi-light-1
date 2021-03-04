package io.github.com.pages.feedback;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.material.annotations.JDIBufferLinear;
import com.epam.jdi.light.material.elements.displaydata.Typography;
import com.epam.jdi.light.material.elements.feedback.ProgressBar;

public class LinearFrame extends Section {

    @UI(".MuiLinearProgress-root")
    @JDIBufferLinear(root = ".MuiLinearProgress-root",
            bar1 = "(//*[contains(@class, 'MuiLinearProgress-bar')])[1]",
            bar2 = "(//*[contains(@class, 'MuiLinearProgress-bar')])[2]",
            dashed = ".MuiLinearProgress-dashed")
    public ProgressBar linearDefault;

    @UI(".MuiTypography-root")
    public Typography linearTypography;

    @UI("(//*[contains(@class, 'MuiCircularProgress-root')])[1]")
    public ProgressBar circularBackground;

    @UI("(//*[contains(@class, 'MuiCircularProgress-root')])[2]")
    public ProgressBar circularTop;
}