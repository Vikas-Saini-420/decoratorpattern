package org.vikas.TextFormatter;

public class Underline implements TextFormatterDecorator{
    private TextFormatter textFormatter;

    public Underline(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    @Override
    public String format(String text) {
        System.out.println("Underline text: " + text);
        return "<u>" + textFormatter.format(text) + "</u>";
    }
}
