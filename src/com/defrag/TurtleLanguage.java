package com.defrag;

import com.intellij.lang.Language;

public class TurtleLanguage extends Language {
    public static final TurtleLanguage INSTANCE = new TurtleLanguage();

    private TurtleLanguage() {
        super("Turtle");
    }
}
