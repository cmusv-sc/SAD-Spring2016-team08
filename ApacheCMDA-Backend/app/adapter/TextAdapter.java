package adapter;

/**
 * Created by XinHong on 4/19/16.
 */
public class TextAdapter implements TextFormattable{
    AdvancedTextFormattable advancedTextFormattable;

    public TextAdapter(String targetType) {
        if (targetType.equalsIgnoreCase("line")) {
            advancedTextFormattable = new LineFormatter();
        }
        else {
            advancedTextFormattable = new ParagraphFormatter();
        }
    }

    @Override
    public String formatText(String targetType, String text) {
        String res = "";
        if (targetType.equalsIgnoreCase("line")) {
            res = advancedTextFormattable.formatTextToLine(text);
        }
        else {
            res = advancedTextFormattable.formatTextToParagraph(text);
        }
        return res;
    }
}
