public enum Color {

    RESET("\033[0m"),

    BLACK("\033[0;30m"),    // BLACK
    RED("\033[0;31m"),      // RED
    GREEN("\033[0;32m"),    // GREEN
    YELLOW("\033[0;33m"),   // YELLOW
    BLUE("\033[0;34m"),     // BLUE
    Magenta("\033[0;35m"),  // Magenta
    CYAN("\033[0;36m"),     // CYAN
    WHITE("\033[0;37m"),    // WHITE

    // Bold
    BLACK_BOLD("\033[1;30m"),   // BLACK
    WHITE_BOLD("\033[1;37m"),   // WHITE

    // Background
    BLACK_BACKGROUND("\033[40m"),   // BLACK
    RED_BACKGROUND("\033[41m"),     // RED
    GREEN_BACKGROUND("\033[42m"),   // GREEN
    YELLOW_BACKGROUND("\033[43m"),  // YELLOW
    BLUE_BACKGROUND("\033[44m"),    // BLUE
    MAGENTA_BACKGROUND("\033[45m"), // Magenta
    CYAN_BACKGROUND("\033[46m"),    // CYAN
    WHITE_BACKGROUND("\033[47m"),   // WHITE

    // High Intensity
    BLACK_BRIGHT("\033[0;90m"),     // BLACK
    RED_BRIGHT("\033[0;91m"),       // RED
    GREEN_BRIGHT("\033[0;92m"),     // GREEN
    YELLOW_BRIGHT("\033[0;93m"),    // YELLOW
    BLUE_BRIGHT("\033[0;94m"),      // BLUE
    Magenta_BRIGHT("\033[0;95m"),   // Magenta
    CYAN_BRIGHT("\033[0;96m"),      // CYAN
    WHITE_BRIGHT("\033[0;97m"),     // WHITE

    // Bold High Intensity
    BLACK_BOLD_BRIGHT("\033[1;90m"),    // BLACK
    RED_BOLD_BRIGHT("\033[1;91m"),      // RED
    GREEN_BOLD_BRIGHT("\033[1;92m"),    // GREEN
    YELLOW_BOLD_BRIGHT("\033[1;93m"),   // YELLOW
    BLUE_BOLD_BRIGHT("\033[1;94m"),     // BLUE
    Magenta_BOLD_BRIGHT("\033[1;95m"),  // Magenta
    CYAN_BOLD_BRIGHT("\033[1;96m"),     // CYAN
    WHITE_BOLD_BRIGHT("\033[1;97m"),    // WHITE

    // High Intensity backgrounds
    BLACK_BACKGROUND_BRIGHT("\033[0;100m"),     // BLACK
    RED_BACKGROUND_BRIGHT("\033[0;101m"),       // RED
    GREEN_BACKGROUND_BRIGHT("\033[0;102m"),     // GREEN
    YELLOW_BACKGROUND_BRIGHT("\033[0;103m"),    // YELLOW
    BLUE_BACKGROUND_BRIGHT("\033[0;104m"),      // BLUE
    Magenta_BACKGROUND_BRIGHT("\033[0;105m"),   // Magenta
    CYAN_BACKGROUND_BRIGHT("\033[0;106m"),      // CYAN
    WHITE_BACKGROUND_BRIGHT("\033[0;107m");     // WHITE

    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
