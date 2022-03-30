package io.github.epam.material.tests;

import com.epam.jdi.light.material.elements.displaydata.MUIListItem;
import io.github.epam.TestsInit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.listPage;
import static io.github.com.pages.displaydata.MUIListPage.checkboxList;

public class ListPerformanceTests extends TestsInit {

    @BeforeClass
    public void setup() {
        listPage.open();
        listPage.checkOpened();
        checkboxList.show();
    }


    @Test
    public void performance() {
        for (int i = 0; i < 20; i++) {
            checkboxList.items().get(0).has().text("Line item 1");
            checkboxList.items().get(1).has().text("Line item 2");
            checkboxList.items().get(1).find(".MuiCheckbox-root").click();
            checkboxList.items().get(1).find(".MuiCheckbox-root").has().cssClass("Mui-checked");
            checkboxList.items().get(1).find(".MuiCheckbox-root").click();
            checkboxList.items().get(2).has().text("Line item 3");
            checkboxList.items().get(3).has().text("Line item 4");
        }
    }

    @Test
    public void performanceTestVariable() {
        java.util.List<MUIListItem> list = checkboxList.items();
        for (int i = 0; i < 20; i++) {
            list.get(0).has().text("Line item 1");
            list.get(1).has().text("Line item 2");
            list.get(1).find(".MuiCheckbox-root").click();
            list.get(1).find(".MuiCheckbox-root").has().cssClass("Mui-checked");
            list.get(1).find(".MuiCheckbox-root").click();
            list.get(2).has().text("Line item 3");
            list.get(3).has().text("Line item 4");
        }
    }

    @Test
    public void performanceUI() {
        for (int i = 0; i < 20; i++) {
            checkboxList.checkboxItems.get(1).has().text("Line item 1");
            checkboxList.checkboxItems.get(2).has().text("Line item 2");
            checkboxList.checkboxItems.get(2).find(".MuiCheckbox-root").click();
            checkboxList.checkboxItems.get(2).find(".MuiCheckbox-root").has().cssClass("Mui-checked");
            checkboxList.checkboxItems.get(2).find(".MuiCheckbox-root").click();
            checkboxList.checkboxItems.get(3).has().text("Line item 3");
            checkboxList.checkboxItems.get(4).has().text("Line item 4");
        }
    }

    @Test
    public void performanceUITestVariable() {
        java.util.List<MUIListItem> list = checkboxList.checkboxItems;
        for (int i = 0; i < 20; i++) {
            list.get(1).has().text("Line item 1");
            list.get(2).has().text("Line item 2");
            list.get(2).find(".MuiCheckbox-root").click();
            list.get(2).find(".MuiCheckbox-root").has().cssClass("Mui-checked");
            list.get(2).find(".MuiCheckbox-root").click();
            list.get(3).has().text("Line item 3");
            list.get(4).has().text("Line item 4");
        }
    }

    @Test
    public void performanceVar() {
        for (int i = 0; i < 20; i++) {
            checkboxList.itemsVariable().get(0).has().text("Line item 1");
            checkboxList.itemsVariable().get(1).has().text("Line item 2");
            checkboxList.itemsVariable().get(1).find(".MuiCheckbox-root").click();
            checkboxList.itemsVariable().get(1).find(".MuiCheckbox-root").has().cssClass("Mui-checked");
            checkboxList.itemsVariable().get(1).find(".MuiCheckbox-root").click();
            checkboxList.itemsVariable().get(2).has().text("Line item 3");
            checkboxList.itemsVariable().get(3).has().text("Line item 4");
        }
    }

    @Test
    public void performanceVarTestVariable() {
        java.util.List<MUIListItem> list = checkboxList.itemsVariable();
        for (int i = 0; i < 20; i++) {
            list.get(0).has().text("Line item 1");
            list.get(1).has().text("Line item 2");
            list.get(1).find(".MuiCheckbox-root").click();
            list.get(1).find(".MuiCheckbox-root").has().cssClass("Mui-checked");
            list.get(1).find(".MuiCheckbox-root").click();
            list.get(2).has().text("Line item 3");
            list.get(3).has().text("Line item 4");
        }
    }
}
