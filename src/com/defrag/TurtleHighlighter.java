package com.defrag;

import com.intellij.ide.highlighter.JavaHighlightingColors;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.StringEscapesTokenTypes;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.coverage.gnu.trove.THashMap;

import java.util.Map;

public class TurtleHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> keys1;
    private static final Map<IElementType, TextAttributesKey> keys2;

    @Override
    @NotNull
    public Lexer getHighlightingLexer() {
        return new TurtleHighlightingLexer();
    }

    public static final TextAttributesKey PREFIX = TextAttributesKey.createTextAttributesKey(
            "TURTLE.PREFIX",
            JavaHighlightingColors.ANNOTATION_NAME_ATTRIBUTES
    );
    public static final TextAttributesKey PREFIX_KEY = TextAttributesKey.createTextAttributesKey(
            "TURTLE.PREFIX_KEY",
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey PREFIX_VALUE = TextAttributesKey.createTextAttributesKey(
            "TURTLE.PREFIX_VALUE",
            DefaultLanguageHighlighterColors.STATIC_FIELD
    );

    public static final TextAttributesKey SUBJ_KEY = TextAttributesKey.createTextAttributesKey(
            "TURTLE.SUBJ_KEY",
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey SUBJ_VALUE = TextAttributesKey.createTextAttributesKey(
            "TURTLE.SUBJ_VALUE",
            DefaultLanguageHighlighterColors.CONSTANT
    );

    public static final TextAttributesKey PROP_KEY = TextAttributesKey.createTextAttributesKey(
            "TURTLE.PROP_KEY",
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey PROP_VALUE = TextAttributesKey.createTextAttributesKey(
            "TURTLE.PROP_VALUE",
            DefaultLanguageHighlighterColors.CONSTANT
    );

    public static final TextAttributesKey OBJ_KEY = TextAttributesKey.createTextAttributesKey(
            "TURTLE.OBJ_KEY",
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey OBJ_LITERAL_VALUE = TextAttributesKey.createTextAttributesKey(
            "TURTLE.OBJ_LITERAL_VALUE",
            DefaultLanguageHighlighterColors.STRING
    );
    public static final TextAttributesKey OBJ_VALUE = TextAttributesKey.createTextAttributesKey(
            "TURTLE.OBJ_VALUE",
            DefaultLanguageHighlighterColors.CONSTANT
    );

    public static final TextAttributesKey PROPERTIES_VALID_STRING_ESCAPE = TextAttributesKey.createTextAttributesKey(
            "PROPERTIES.VALID_STRING_ESCAPE",
            DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE
    );
    public static final TextAttributesKey PROPERTIES_INVALID_STRING_ESCAPE = TextAttributesKey.createTextAttributesKey(
            "PROPERTIES.INVALID_STRING_ESCAPE",
            DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE
    );

    static {
        keys1 = new THashMap<>();
        keys2 = new THashMap<>();

        keys1.put(TurtleTokenTypes.PREFIX, PREFIX);
        keys1.put(TurtleTokenTypes.PREFIX_KEY, PREFIX_KEY);
        keys1.put(TurtleTokenTypes.PREFIX_VALUE, PREFIX_VALUE);

        keys1.put(TurtleTokenTypes.SUBJECT_KEY, SUBJ_KEY);
        keys1.put(TurtleTokenTypes.SUBJECT_VALUE, SUBJ_VALUE);

        keys1.put(TurtleTokenTypes.PROP_KEY, PROP_KEY);
        keys1.put(TurtleTokenTypes.PROP_VALUE, PROP_VALUE);

        keys1.put(TurtleTokenTypes.OBJ_KEY, OBJ_KEY);
        keys1.put(TurtleTokenTypes.OBJ_LITERAL_VALUE, OBJ_LITERAL_VALUE);
        keys1.put(TurtleTokenTypes.OBJ_VALUE, OBJ_VALUE);

        keys1.put(StringEscapesTokenTypes.VALID_STRING_ESCAPE_TOKEN, PROPERTIES_VALID_STRING_ESCAPE);
        // in fact all back-slashed escapes are allowed
        keys1.put(StringEscapesTokenTypes.INVALID_CHARACTER_ESCAPE_TOKEN, PROPERTIES_INVALID_STRING_ESCAPE);
        keys1.put(StringEscapesTokenTypes.INVALID_UNICODE_ESCAPE_TOKEN, PROPERTIES_INVALID_STRING_ESCAPE);
    }

    @Override
    @NotNull
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return SyntaxHighlighterBase.pack(keys1.get(tokenType), keys2.get(tokenType));
    }
}
