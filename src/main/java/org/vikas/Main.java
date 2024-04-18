package org.vikas;

import org.vikas.TextFormatter.*;

public class Main {
    public static void main(String[] args) {
        TextFormatter textFormatter = new Italic(new Bold(new Underline(new StrikeThrough(new PlainText()))));
        System.out.println(textFormatter.format("Hello, World!"));

        TextFormatter textFormatter1 = new Bold(new Underline(new StrikeThrough(new PlainText())));
        System.out.println(textFormatter1.format("Hello, World!"));

        TextFormatter textFormatter2 = new Underline(new StrikeThrough(new PlainText()));
        System.out.println(textFormatter2.format("Hello, World!"));

        TextFormatter textFormatter3 = new StrikeThrough(new PlainText());
        System.out.println(textFormatter3.format("Hello, World!"));

        TextFormatter textFormatter4 = new PlainText();
        System.out.println(textFormatter.format("Hello, World!"));
    }
}