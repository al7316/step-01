import java.util.HashMap;
import java.util.Map;

public class OopsBannerApp {

    // 1. The "Database" - Using a Map to store character patterns
    private static final Map<Character, String[]> BANNER_PATTERNS = new HashMap<>();

    static {
        BANNER_PATTERNS.put('O', new String[]{
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        });
        BANNER_PATTERNS.put('P', new String[]{
            " ****  ",
            " *   * ",
            " ****  ",
            " *     ",
            " *     "
        });
        BANNER_PATTERNS.put('S', new String[]{
            "  **** ",
            " *     ",
            "  ***  ",
            "     * ",
            " ****  "
        });
    }

    public static void main(String[] args) {
        displayBanner("OOPS");
    }

    /**
     * 2. The Rendering Logic
     * Iterates through the height of the patterns and prints each character's 
     * corresponding row side-by-side.
     */
    public static void displayBanner(String input) {
        input = input.toUpperCase();
        int height = 5; // Standard height for our patterns

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (BANNER_PATTERNS.containsKey(c)) {
                    // Append the current row of the character plus a space for padding
                    line.append(BANNER_PATTERNS.get(c)[i]).append("  ");
                }
            }
            System.out.println(line);
        }
    }
}