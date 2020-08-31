public enum Color {

    // Reset
    RESET("\033[0m"),
    // Bold
    BLACK_BOLD("\033[1;30m"),   // BLACK
    PURPLE_BOLD_BRIGHT("\033[1;95m"),// PURPLE
    // Background
    RED_BACKGROUND("\033[41m"),     // RED
    BLUE_BACKGROUND("\033[44m"),    // BLUE
    MAGENTA_BACKGROUND("\033[45m"), // Magenta
    CYAN_BACKGROUND("\033[46m");    // CYAN

    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}

