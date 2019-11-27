package com.defrag;

import com.intellij.lexer.DelegateLexer;

public class TurtleHighlightingLexer extends DelegateLexer {

    public TurtleHighlightingLexer() {
        super(new TurtleLexer());
    }
}
