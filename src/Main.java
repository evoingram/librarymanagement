import logger.*;

import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        LibraryLogger logger = new LibraryLogger();
        logger.logInfo("Hello info world!");
        logger.logWarn("Hello warn world!");
        logger.logError("Hello error world!");
        logger.logMessage(Level.INFO, "Hello custom logging world!");
    }
}