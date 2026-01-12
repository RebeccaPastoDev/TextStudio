package semtexteditor;

/**
 *
 * @author rebec
 */
import java.awt.Color;

public class ColorTheme {
    private Color background;
    private Color foreground;
    private Color textColor;

    public ColorTheme(Color background, Color foreground, Color textColor) {
        this.background = background;
        this.foreground = foreground;
        this.textColor = textColor;
    }

    public Color getBackground() {
        return background;
    }

    public Color getForeground() {
        return foreground;
    }

    public Color getTextColor() {
        return textColor;
    }
}