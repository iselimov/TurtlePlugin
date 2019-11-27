package com.defrag;

import com.intellij.lexer.FlexAdapter;

public class TurtleLexer extends FlexAdapter {

    public TurtleLexer() {
        super(new _TurtleLexer(null));
    }
}
