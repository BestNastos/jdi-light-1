package io.github.epam.material.tests.layout;

import static io.github.com.StaticSite.gridPage;
import static io.github.com.pages.layout.GridPage.basicGrid;
import static io.github.com.pages.layout.GridPage.complexGrid;
import static io.github.com.pages.layout.GridPage.listButton;
import static io.github.com.pages.layout.GridPage.listInput;
import static io.github.com.pages.layout.GridPage.rootGrid;

import io.github.epam.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * To see an example of Grid web element please visit
 * https://material-ui.com/components/grid/
 */

public class GridTests extends TestsInit {

    @BeforeMethod
    public void before() {
        gridPage.open();
        gridPage.isOpened();
    }

    @Test
    public void gridTest() {
        rootGrid.is().displayed();
        rootGrid.attr("class").contains("MuiContainer-maxWidthXl");
        basicGrid.is().displayed();
        complexGrid.is().displayed();

    }

    @Test
    public void buttonsTest() {
        listButton.forEach(button -> button.is().displayed());
        listButton.forEach(button -> button.click());
    }

    @Test
    public void inputsTest() {
        listInput.forEach(input -> {
            input.is().displayed();
            input.setValue("xs=5");
            input.is().text("xs=5");
        });
    }

}
