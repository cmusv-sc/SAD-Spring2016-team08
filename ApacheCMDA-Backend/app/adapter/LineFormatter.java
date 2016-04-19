package adapter;

/**
 * Created by XinHong on 4/19/16.
 */
public class LineFormatter implements AdvancedTextFormattable {
    @Override
    public String formatTextToLine(String text) {
        String formattedText=text.replace(".","\n");
        return formattedText;
    }

    @Override
    public String formatTextToParagraph(String text) {
        //do nothing
        return "";
    }
}
