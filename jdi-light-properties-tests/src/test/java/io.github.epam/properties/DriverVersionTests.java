package io.github.epam.properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.security.InvalidParameterException;
import java.util.Properties;

import static utils.Property.DRIVER_VERSION_PROPERTY;
import static utils.PropertyValidationUtils.LINK_TO_EXAMPLES;
import static utils.PropertyValidationUtils.validateProperties;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class DriverVersionTests {
    @DataProvider
    public static Object[] negativeData() {
        return new Object[]{"latest", "LATES", "prelatest", "", "RELATEST", "2,31", "ten.eleven", "1.76", "2"};
    }

    @DataProvider
    public static Object[] positiveData() {
        return new Object[]{"LATEST", "PRELATEST", "1.23.3", "3.141.59", "4.0.0-alpha-2"};
    }

    @Test(dataProvider = "negativeData")
    public void negativeTest(String value) {
        Properties properties = new Properties();
        properties.setProperty(DRIVER_VERSION_PROPERTY.getName(), value);
        try {
            validateProperties(properties);
            fail("Value '" + value + "' should not be valid for this test.");
        } catch (InvalidParameterException exp) {
            String expMessage = exp.getMessage();
            assertEquals(expMessage, DRIVER_VERSION_PROPERTY.getExMsg() + LINK_TO_EXAMPLES);
        }
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String value) {
        Properties properties = new Properties();
        properties.setProperty(DRIVER_VERSION_PROPERTY.getName(), value);
        validateProperties(properties);
    }
}
