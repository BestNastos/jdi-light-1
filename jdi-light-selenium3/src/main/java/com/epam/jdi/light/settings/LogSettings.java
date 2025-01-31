package com.epam.jdi.light.settings;

import com.epam.jdi.light.logger.LogLevels;
import com.epam.jdi.light.logger.Strategy;
import com.jdiai.tools.func.JFunc1;
import org.openqa.selenium.logging.LogEntry;

import java.util.ArrayList;
import java.util.List;

import static com.epam.jdi.light.logger.LogLevels.INFO;
import static com.epam.jdi.light.logger.Strategy.FAIL;
import static com.jdiai.tools.LinqUtils.newList;

public class LogSettings {
    public LogLevels logLevel = INFO;
    public boolean writeToAllure = true;
    public boolean writeToLog = true;
    public List<Strategy> screenStrategy = newList(FAIL);
    public List<Strategy> htmlCodeStrategy = new ArrayList<>();
    public List<Strategy> requestsStrategy = new ArrayList<>();
    public JFunc1<LogEntry, Boolean> filterHttpRequests =
        l -> l.getMessage().contains("\"status\":\"4") || l.getMessage().contains("\"status\":\"5");
    public LogInfoDetails logInfoDetails = null;
}
