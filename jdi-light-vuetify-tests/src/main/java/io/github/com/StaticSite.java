package io.github.com;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.WaitAfterAction;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Text;
import io.github.com.entities.User;
import io.github.com.pages.AlertsPage;
import io.github.com.pages.AvatarsPage;
import io.github.com.pages.BadgesPage;
import io.github.com.pages.BannersPage;
import io.github.com.pages.CheckboxesPage;
import io.github.com.pages.DividersPage;

@JSite("https://jdi-testing.github.io/jdi-light/vuetify")
public class StaticSite {

    public static User DEFAULT_USER = new User();

    @UI("#login-form")
    public static Form<User> loginForm;

    @Css(".logout")
    public static Button logout;
    public static Button userIcon;
    public static Text userName;

    @Url("/alerts")
    public static AlertsPage alertsPage;

    @Url("/avatars")
    public static AvatarsPage avatarsPage;

    @Url("/badges")
    public static BadgesPage badgesPage;

    @Url("/banners")
    public static BannersPage bannersPage;

    @WaitAfterAction(3)
    @Url("/checkboxes")
    public static CheckboxesPage checkboxesPage;

    @WaitAfterAction(3)
    @Url("/dividers")
    public static DividersPage dividersPage;
}
