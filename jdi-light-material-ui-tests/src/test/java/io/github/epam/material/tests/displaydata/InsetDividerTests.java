package io.github.epam.material.tests.displaydata;

import io.github.epam.TestsInit;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.light.asserts.core.SoftAssert.jdiAssert;
import static io.github.com.StaticSite.insetDividerPage;
import static io.github.com.pages.displaydata.InsetDividerPage.insetDividers;
import static io.github.com.pages.displaydata.InsetDividerPage.itemWithTextList;

public class InsetDividerTests extends TestsInit {

    @BeforeMethod
    public void before() {
        insetDividerPage.open();
        insetDividerPage.isOpened();
    }

    @Test
    public void insetDividerTest() {
        itemWithTextList.has().size(3);
        itemWithTextList.getItemByText("Photos").has().secondaryText("Jan 9, 2014");

        jdiAssert(insetDividers, Matchers.hasSize(2));
        insetDividers.forEach(divider -> divider.is().inset());
    }
}
