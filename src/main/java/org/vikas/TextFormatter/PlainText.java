package org.vikas.TextFormatter;

public class PlainText implements TextFormatter {
    @Override
    public String format(String text) {
        System.out.println("Plain text: " + text);
        return text;
    }
}
