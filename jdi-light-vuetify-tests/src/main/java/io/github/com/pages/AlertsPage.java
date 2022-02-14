package io.github.com.pages;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.vuetify.elements.common.Alert;
import io.github.com.custom.CustomAlert;

public class AlertsPage extends VuetifyPage {
    // basic alerts section
    @UI(".success")
    public static CustomAlert successAlert;
    @UI(".info")
    public static CustomAlert infoAlert;
    @UI(".warning")
    public static CustomAlert warningAlert;
    @UI(".error")
    public static CustomAlert errorAlert;

    // alerts with props section
    @UI("#alertsWithProps > .red")
    public static Alert redAlert;
    @UI("#alertsWithProps > .blue-grey")
    public static Alert blueGreyAlert;
    @UI("#alertsWithProps > .pink")
    public static Alert pinkAlert;
    @UI("#alertsWithProps > .indigo")
    public static Alert indigoAlert;

    // dense alerts
    @UI(".v-alert--dense.info")
    public static CustomAlert denseInfoAlert;
    @UI(".v-alert--dense.success--text")
    public static CustomAlert denseSuccessAlert;
    @UI(".v-alert--dense.warning")
    public static CustomAlert denseWarningAlert;
    @UI(".v-alert--dense.error--text")
    public static CustomAlert denseErrorAlert;

    // dismissible alert
    @UI("#dismissibleAlert > .v-alert")
    public static CustomAlert dismissibleAlert;
    @UI("#dismissibleAlert > .text-center > button")
    public static Button dismissibleAlertResetButton;

    // alerts with icon
    @UI("#alertsWithIcon > div:nth-child(1)")
    public static CustomAlert firstIconAlert;
    @UI("#alertsWithIcon > div:nth-child(2)")
    public static CustomAlert secondIconAlert;
    @UI("#alertsWithIcon > div:nth-child(3)")
    public static CustomAlert thirdIconAlert;

    // outlined alerts
    @UI("#outlinedAlerts > div:nth-child(1)")
    public static Alert purpleOutlinedAlert;
    @UI("#outlinedAlerts > div:nth-child(2)")
    public static Alert successOutlinedAlert;
    @UI("#outlinedAlerts > div:nth-child(3)")
    public static Alert warningOutlinedAlert;

    // prominent alerts
    @UI("#prominentAlerts > .error")
    public static CustomAlert prominentErrorAlert;
    @UI("#prominentAlerts > div:nth-child(2)")
    public static CustomAlert prominentSchoolAlert;
    @UI("#prominentAlerts > .info--text")
    public static CustomAlert prominentLockAlert;

    // text alerts
    @UI("#textAlerts > div:nth-child(1)")
    public static Alert infoTextAlert;
    @UI("#textAlerts > div:nth-child(2)")
    public static Alert fireTextAlert;
    @UI("#textAlerts > div:nth-child(3)")
    public static Alert timeTextAlert;
    @UI("#textAlerts > div:nth-child(4)")
    public static Alert warningTextAlert;

    // transition alert
    @UI("#transitionAlert > .v-alert")
    public static Alert transitionAlert;
    @UI("#transitionAlert > .text-center > button")
    public static Button transitionAlertToggleButton;

}
