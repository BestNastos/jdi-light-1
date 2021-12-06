package io.github.epam.material.tests.surfaces;

import io.github.epam.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.paperPage;
import static io.github.com.pages.surfaces.PaperPage.paper;

/**
 * To see an example of Paper web element please visit
 * https://material-ui.com/components/paper
 */

public class PaperTests extends TestsInit {

    private static final String WITH_ZERO_ELEVATION = "Paper with elevation = 0";
    private static final String WITH_DEFAULT_ELEVATION = "Paper with default elavation";
    private static final String WITH_ELEVATION_EQUALS_THREE = "Paper with elevation = 3";
    private static final String OUTLINED_PAPER = "Outlined paper";
    private static final String OUTLINED_SQUARE_PAPER = "Outlined square paper";
    private static final String YOU_CLICKED = "You clicked: %s";

    @BeforeMethod
    public void beforeTest() {
        paperPage.open();
        paperPage.isOpened();
    }

    @Test
    public void defaultPaperTest() {

        paper.get(1).is().text(WITH_ZERO_ELEVATION);
        paper.get(1).click();
        paper.get(6).is().text(String.format(YOU_CLICKED, WITH_ZERO_ELEVATION));

        paper.get(2).is().text(WITH_DEFAULT_ELEVATION);
        paper.get(2).click();
        paper.get(6).is().text(String.format(YOU_CLICKED, WITH_DEFAULT_ELEVATION));

        paper.get(3).is().text(WITH_ELEVATION_EQUALS_THREE);
        paper.get(3).click();
        paper.get(6).is().text(String.format(YOU_CLICKED, WITH_ELEVATION_EQUALS_THREE));

        paper.get(4).is().text(OUTLINED_PAPER);
        paper.get(4).click();
        paper.get(6).is().text(String.format(YOU_CLICKED, OUTLINED_PAPER));

        paper.get(5).is().text(OUTLINED_SQUARE_PAPER);
        paper.get(5).click();
        paper.get(6).is().text(String.format(YOU_CLICKED, OUTLINED_SQUARE_PAPER));
    }
}
