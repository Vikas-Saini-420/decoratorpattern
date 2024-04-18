package org.vikas.TextFormatter;

public class StrikeThrough implements TextFormatterDecorator{
    private TextFormatter textFormatter;

    public StrikeThrough(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    @Override
    public String format(String text) {
        System.out.println("StrikeThrough text: " + text);
        return "<s>" + textFormatter.format(text) + "</s>";
    }
}
