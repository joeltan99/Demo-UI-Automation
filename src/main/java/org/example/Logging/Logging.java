package org.example.Logging;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public interface Logging {
    default Logger getLogger() {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
        return LogManager.getLogger(getClass());
    }
}
