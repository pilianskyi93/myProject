package Helpers;

import org.apache.logging.log4j.Logger;

import static Helpers.ConsoleColors.*;
import static Helpers.Level.INFO;

public class ColorPrinter {

    public static void printColorMessage(String message, Logger logger, Level level) {
        switch (level) {
            case INFO:
                logger.info(BLUE + message + RESET);
                break;
            case DEBUG:
                logger.debug(GREEN + message + RESET);
                break;
            case ERROR:
                logger.error(RED + message + RESET);
        }

    }
}