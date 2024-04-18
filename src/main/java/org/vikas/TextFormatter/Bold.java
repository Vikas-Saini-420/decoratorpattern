package org.vikas.TextFormatter;

public class Bold  implements TextFormatterDecorator{
    private TextFormatter textFormatter;
    public Bold(TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }
    @Override
    public String format(String text) {
        System.out.println("Bold text: " + text);
        return "<b>" + textFormatter.format(text) + "</b>";
    }
}
