package net.mercadona.decorationstuff;

public class ConsoleColors {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String BOLD = "\u001B[1m";
    private static final String ANSI_ORANGE = "\u001B[38;5;208m";

    public static String getAnsiReset() {
        return ANSI_RESET;
    }

    public static String getAnsiRed() {
        return ANSI_RED;
    }

    public static String getAnsiGreen() {
        return ANSI_GREEN;
    }

    public static String getAnsiYellow() {
        return ANSI_YELLOW;
    }

    public static String getAnsiBlue() {
        return ANSI_BLUE;
    }

    public static String getAnsiCyan() {
        return ANSI_CYAN;
    }

    public static String getAnsiOrange() {
        return ANSI_ORANGE;
    }

    public static String changeToRed(String message) {
        return ANSI_RED + message + ANSI_RESET;
    }
    
    public static String changeToOrange(String message) {
        return ANSI_ORANGE + message + ANSI_RESET;
    }

    public static String changeToGreen(String message) {
        return ANSI_GREEN + message + ANSI_RESET;
    }
    
    public static String changeToYellow(String message) {
        return ANSI_YELLOW + message + ANSI_RESET;
    }
    public static String changeToBlue(String message) {
        return ANSI_BLUE + message + ANSI_RESET;
    }

    public static String changeToCyan(String message) {
        return ANSI_CYAN + message + ANSI_RESET;
    }

    public static String changeToBoldRed(String message) {
        return BOLD + ANSI_RED + message + ANSI_RESET;
    }
    
    public static String changeToBoldOrange(String message) {
        return BOLD + ANSI_ORANGE + message + ANSI_RESET;
    }

    public static String changeToBoldGreen(String message) {
        return BOLD + ANSI_GREEN + message + ANSI_RESET;
    }
    public static String changeToBoldYellow(String message) {
        return BOLD + ANSI_YELLOW + message + ANSI_RESET;
    }
    public static String changeToBoldBlue(String message) {
        return BOLD + ANSI_BLUE + message + ANSI_RESET;
    }

    public static String changeToBoldCyan(String message) {
        return BOLD + ANSI_CYAN + message + ANSI_RESET;
    }
}
