package adapter;

/**
 * Created by XinHong on 4/19/16.
 */
public class ParagraphFormatter implements AdvancedTextFormattable {
    @Override
    public String formatTextToLine(String text) {
        //do nothing
        return "";
    }

    @Override
    public String formatTextToParagraph(String text) {
        String formattedText=text.trim();
        return formattedText;
    }
}
