package com.epam.jdi.light.vuetify.elements.complex;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.base.UIBaseElement;
import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.WebList;
import static com.epam.jdi.light.elements.init.UIFactory.$;
import static com.epam.jdi.light.elements.init.UIFactory.$$;
import com.epam.jdi.light.vuetify.asserts.CalendarAssert;
import java.util.GregorianCalendar;

public class Calendar extends UIBaseElement<CalendarAssert> {

    private final String MENU = ".menuable__content__active [role='menuitem']";
    private final String INTERVAL = ".v-calendar-daily__day-interval";
    private final String WEEKLY = ".v-calendar-weekly__week";
    private final String WEEKLY_DAY = ".v-calendar-weekly__day";


    public WebList events() {
        try {
            return finds(".v-event-timed");
        } catch (RuntimeException rex) {
            return finds(".v-event");
        }
    }

    public WebList intervals(int day) {
        return finds(".v-calendar-daily__day").get(day).finds(INTERVAL);
    }

    private WebList categories() {
        return finds(".v-calendar-category__category");
    }

    private UIElement eventCard() {
        return $(".v-card--flat");
    }

    private UIElement slot(int week, int day, int slot) {
        WebList weeks = finds(WEEKLY);
        return weeks.get(week).finds(WEEKLY_DAY).get(day).finds(".v-sheet").get(slot);
    }

    @JDIAction("Check that {name} has daily type")
    public boolean isDailyType() {
        return finds(".v-calendar-daily_head-day").size() == 1;
    }

    @JDIAction("Check that {name} has weekly type")
    public boolean isWeeklyType() {
        return finds(".v-calendar-daily__day").size() == 7;
    }

    @JDIAction("Check that {name} has categories")
    public boolean hasCategories() {
        try {
            return categories().isNotEmpty();
        } catch (RuntimeException rex) {
            System.out.println("Categories not found");
            return false;
        }
    }

    @JDIAction("Check that {name} has intervals")
    public boolean hasDayIntervals() {
        try {
            return finds(INTERVAL).isNotEmpty();
        } catch (RuntimeException rex) {
            System.out.println("Intervals not found");
            return false;
        }
    }

    @JDIAction("Get {name} {0} category name ")
    public String getCategory(int catNum) {
        return categories().get(catNum).text();
    }

    @JDIAction("Get {name} {0} interval text")
    public String getDayInterval(int intNum) {
        return finds(INTERVAL).get(intNum).text();
    }

    @JDIAction("Switch {name} to the previous day")
    public void previousDay() {
        find(".mdi-chevron-left").click();
    }

    @JDIAction("Switch {name} to the next day")
    public void nextDay() {
        find(".mdi-chevron-right").click();
    }

    @JDIAction("Switch {name} to the present day")
    public void today() {
        find("//span[contains(text(),'Today')]").click();
    }

    @JDIAction("Check that {name} has the current day")
    public boolean isToday() {
        try {
            return find(".v-present button").text()
                    .equalsIgnoreCase(String.valueOf(new GregorianCalendar().get(java.util.Calendar.DAY_OF_MONTH)));
        } catch (RuntimeException ex) {
            return false;
        }
    }

    @JDIAction("Get {name} {0} event name")
    public String getDailyEvent(int eventNum) {
        return events().get(eventNum).text();
    }

    private void openMenu() {
        find(".mdi-menu-down").click();
    }

    @JDIAction("Change {name} to the {0} type")
    public void selectCalendarType(String type) {
        openMenu();
        $$(MENU).select(type);
    }

    @JDIAction("Change {name} to the {0} type")
    public void selectCalendarType(int type) {
        openMenu();
        $$(MENU).select(type);
    }

    @JDIAction("Close {name} event")
    public void closeEvent() {
        eventCard().find("//span[contains(text(), 'Cancel')]").click();
    }

    @JDIAction("Check that {name} event is opened")
    public boolean eventIsOpened() {
        return eventCard().find("//ancestor::div[@role='menu']").attr("class").contains("active");
    }

    @JDIAction("Select {name} slot")
    public void selectSlot(int week, int day, int slot) {
        slot(week, day, slot).hover();
    }

    @JDIAction("Get {name} slot")
    public String getSlot(int week, int day, int slot) {
        return slot(week, day, slot).attr("title");
    }

    @JDIAction("Check that {name} has current time line")
    public boolean hasCurrentTimeLine() {
        try {
            find(".v-current-time");
            return true;
        } catch (RuntimeException rex) {
            return false;
        }
    }

    @Override
    public CalendarAssert is() {
        return new CalendarAssert().set(this);
    }
}
