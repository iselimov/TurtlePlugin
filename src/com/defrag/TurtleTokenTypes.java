package com.defrag;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

public final class TurtleTokenTypes {
    //
    public static final IElementType PREFIX = new TurtleElementType("PREFIX");
    public static final IElementType PREFIX_KEY = new TurtleElementType("PREFIX_KEY");
    public static final IElementType PREFIX_VALUE = new TurtleElementType("PREFIX_VALUE");

    public static final IElementType SUBJECT_KEY = new TurtleElementType("SUBJECT_KEY");
    public static final IElementType SUBJECT_VALUE = new TurtleElementType("SUBJECT_VALUE");

    public static final IElementType PROP_KEY = new TurtleElementType("PROP_KEY");
    public static final IElementType PROP_VALUE = new TurtleElementType("PROP_VALUE");

    public static final IElementType OBJ_KEY = new TurtleElementType("OBJ_KEY");
    public static final IElementType OBJ_LITERAL_VALUE = new TurtleElementType("OBJ_LITERAL_VALUE");
    public static final IElementType OBJ_VALUE = new TurtleElementType("OBJ_VALUE");

    public static final IElementType NEXT_OBJ_SEPARATOR = new TurtleElementType("NEXT_OBJ_SEPARATOR");
    public static final IElementType DOT = new TurtleElementType("DOT");

    public static IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
    public static IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;

    public static IElementType END_OF_LINE_COMMENT = new TurtleElementType("END_OF_LINE_COMMENT");
    public static IElementType KEY_CHARACTERS = new TurtleElementType("KEY_CHARACTERS");
    public static IElementType VALUE_CHARACTERS = new TurtleElementType("VALUE_CHARACTERS");
    public static IElementType KEY_VALUE_SEPARATOR = new TurtleElementType("KEY_VALUE_SEPARATOR");

    public static TokenSet COMMENTS = TokenSet.create(END_OF_LINE_COMMENT);
    public static TokenSet WHITESPACES = TokenSet.create(WHITE_SPACE);

    private TurtleTokenTypes() {
    }
}
