package io.github.epam.material.tests.feedback;

import com.jdiai.tools.Timer;
import io.github.epam.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.backdropPage;
import static io.github.com.pages.feedback.BackdropPage.backdrop;
import static io.github.com.pages.feedback.BackdropPage.showBackdropButton;

/**
 * To see an example of Backdrop web element please visit
 * https://material-ui.com/components/backdrop/
 */

public class BackdropTests extends TestsInit {

    private static final Timer TIMER = new Timer(1000L);

    @BeforeMethod
    public void before() {
        backdropPage.open();
    }

    @Test
    public void defaultBackdropTest() {

        showBackdropButton.click();
        TIMER.wait(() -> backdrop.is().visible());
        backdrop.core().click();
        TIMER.wait(() -> backdrop.is().hidden());
    }
}
