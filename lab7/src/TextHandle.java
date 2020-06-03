public class TextHandle {

    private static final int minFontSize = 2;
    private static final int maxFontSize = 100;

    private StringBuilder input;
    private int fontSize;

    public TextHandle() {
        fontSize = 24;
        input = new StringBuilder();
    }

    public TextHandle(int f) {
        fontSize = f;

    }

    public String getInput() {
        return input.toString();
    }

    public int getFontSize() {
        return fontSize;
    }

    public String enterText(String s) {
        input.append(s);
        return input.toString();
    }

    public boolean increaseFontSize() {
        if (fontSize == maxFontSize) {
            return false;
        }
        fontSize += 2;
        return true;

    }

    public boolean decreaseFontSize() {
        if (fontSize == minFontSize) {
            return false;
        }
        fontSize -= 2;
        return true;
    }
}
