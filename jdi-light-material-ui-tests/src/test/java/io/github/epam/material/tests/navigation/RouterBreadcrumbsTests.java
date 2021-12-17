package io.github.epam.material.tests.navigation;

import io.github.epam.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.routerBreadcrumbsPage;
import static io.github.com.pages.navigation.RouterBreadcrumbsPage.mailBoxList;
import static io.github.com.pages.navigation.RouterBreadcrumbsPage.routerBreadcrumbs;


public class RouterBreadcrumbsTests extends TestsInit {

    @BeforeMethod
    public void before() {
        routerBreadcrumbsPage.open();
        routerBreadcrumbsPage.checkOpened();
    }

    @Test
    public void routerIntegrationBreadcrumbsTest() {
        routerBreadcrumbs.has().values("Home", "Inbox");
        mailBoxList.get("Important").click();
        routerBreadcrumbs.has().values("Home", "Inbox", "Important");
        mailBoxList.get("Trash").click();
        routerBreadcrumbs.has().values("Home", "Trash");
        mailBoxList.get("Spam").click();
        routerBreadcrumbs.has().values("Home", "Spam");
        mailBoxList.get("Inbox").click();
        routerBreadcrumbs.has().values("Home", "Inbox");
    }

}
