public enum Color {

    // Reset
    RESET("\033[0m"),
    // Bold
    BLACK_BOLD("\033[1;30m"),   // BLACK
    // Background
    RED_BACKGROUND("\033[41m"),     // RED
    GREEN_BACKGROUND("\033[42m"),   // GREEN
    BLUE_BACKGROUND("\033[44m"),    // BLUE
    MAGENTA_BACKGROUND("\033[45m"), // Magenta
    CYAN_BACKGROUND("\033[46m"),    // CYAN
    // Bold High Intensity
    BLACK_BOLD_BRIGHT("\033[1;90m");    // BLACK

    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}

