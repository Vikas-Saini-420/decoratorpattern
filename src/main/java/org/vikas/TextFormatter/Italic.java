package org.vikas.TextFormatter;

public class Italic implements TextFormatterDecorator{
    private TextFormatter textFormatter;

    public Italic(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    @Override
    public String format(String text) {
        System.out.println("Italic text: " + text);
        return "<i>" + textFormatter.format(text) + "</i>";
    }
}
