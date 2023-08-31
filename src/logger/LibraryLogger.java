package logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LibraryLogger {
    public Logger getLogger() { return Logger.getLogger(LibraryLogger.class.getName()); }

    public void logInfo(String logMessage) {
        Logger logger = getLogger();
        logger.log(Level.INFO, logMessage);
    }

    public void logWarn(String logMessage) {
        Logger logger = getLogger();
        logger.log(Level.WARNING, logMessage);
    }

    public void logError(String logMessage) {
        Logger logger = getLogger();
        logger.log(Level.SEVERE, logMessage);
    }

    public void logMessage(Level logLevel, String logMessage) {
        Logger logger = getLogger();
        logger.log(logLevel, logMessage);
    }
}
