package com.defrag;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

%%

%{
  private static final String PREFIX_PATTERN = "@prefix";
  private boolean inObjValueState = false;
%}

%class _TurtleLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

WHITE_SPACE=\s
LETTERS_OR_DIGITS=\w+
SEPARATOR=[:]
DOT=[.]

PREFIX=[@]{LETTERS_OR_DIGITS}
PREFIX_KEY=\ +{LETTERS_OR_DIGITS}{SEPARATOR}
PREFIX_VALUE=[<]\S+[>]{WHITE_SPACE}*

SUBJECT_KEY=({LETTERS_OR_DIGITS}|{PREFIX_VALUE}){SEPARATOR}
SUBJECT_VALUE={LETTERS_OR_DIGITS}\ +

PROP_KEY={SUBJECT_KEY}
PROP_VALUE={SUBJECT_VALUE}
RDFS_TYPE=[a]{WHITE_SPACE}

OBJ_KEY={SUBJECT_KEY}
OBJ_VALUE={LETTERS_OR_DIGITS}
OBJ_LITERAL_VALUE=[^.,:;\n\r\n]+
NEXT_OBJ_SEPARATOR=[,]
NEXT_PROP_SEPARATOR=[;]

%state PREFIX_KEY
%state PREFIX_VALUE

%state SUBJECT_VALUE

%state PROP_KEY
%state PROP_VALUE

%state OBJ_KEY
%state OBJ_VALUE
%state OBJ_SEPARATOR

%%

<YYINITIAL> {
    {PREFIX} {
        System.err.printf("Prefix %s was found\n", yytext());
        if (PREFIX_PATTERN.equals(yytext())){
            yybegin(PREFIX_KEY);
            return TurtleTokenTypes.PREFIX;
        }
        return TurtleTokenTypes.BAD_CHARACTER;
    }
    {SUBJECT_KEY} {
        System.err.printf("Subject %s was found\n", yytext());
        yybegin(SUBJECT_VALUE);
        return TurtleTokenTypes.SUBJECT_KEY;
    }
}
<PREFIX_KEY> {
    {PREFIX_KEY} {
        System.err.printf("Prefix key %s was found\n", yytext());
        yybegin(PREFIX_VALUE);
        return TurtleTokenTypes.PREFIX_KEY;
    }
}
<PREFIX_VALUE> {
    {PREFIX_VALUE}{DOT} {
        System.err.printf("Prefix value %s was found\n", yytext());
        yybegin(YYINITIAL);
        return TurtleTokenTypes.PREFIX_VALUE;
    }
}
<SUBJECT_VALUE> {
    {SUBJECT_VALUE} {
        System.err.printf("Subject value %s was found\n", yytext());
        yybegin(PROP_KEY);
        return TurtleTokenTypes.SUBJECT_VALUE;
    }
}
<PROP_KEY> {
    {RDFS_TYPE} {
        System.err.printf("Property key %s was found\n", yytext());
        yybegin(OBJ_KEY);
        return TurtleTokenTypes.PROP_VALUE;
    }
    {PROP_KEY} {
        System.err.printf("Property key %s was found\n", yytext());
        yybegin(PROP_VALUE);
        return TurtleTokenTypes.PROP_KEY;
    }
}
<PROP_VALUE> {
    {PROP_VALUE} {
        System.err.printf("Property value %s was found\n", yytext());
        yybegin(OBJ_KEY);
        return TurtleTokenTypes.PROP_VALUE;
    }
}
<OBJ_KEY> {
    {WHITE_SPACE}*{OBJ_KEY} {
        if (inObjValueState){
            return TurtleTokenTypes.OBJ_LITERAL_VALUE;
        }

        System.err.printf("Object key %s was found\n", yytext());
        yybegin(OBJ_VALUE);
        return TurtleTokenTypes.OBJ_KEY;
    }
    {OBJ_LITERAL_VALUE} {
        inObjValueState = true;

        System.err.printf("Object literal value %s was found\n", yytext());
        yybegin(OBJ_SEPARATOR);
        return TurtleTokenTypes.OBJ_LITERAL_VALUE;
    }
}
<OBJ_VALUE> {
    {OBJ_VALUE} {
        System.err.printf("Object value %s was found\n", yytext());
        yybegin(OBJ_SEPARATOR);
        return TurtleTokenTypes.PROP_VALUE;
    }
}
<OBJ_SEPARATOR> {
    {SEPARATOR} {
        yybegin(OBJ_KEY);
        return TurtleTokenTypes.OBJ_LITERAL_VALUE;
    }
    {DOT} {
        inObjValueState = false;

        System.err.printf("Dot %s was found\n", yytext());
        yybegin(YYINITIAL);
        return TurtleTokenTypes.DOT;
    }
    {NEXT_OBJ_SEPARATOR}{WHITE_SPACE}* {
        inObjValueState = false;

        System.err.printf("Next object separator %s was found\n", yytext());
        yybegin(OBJ_KEY);
        return TurtleTokenTypes.NEXT_OBJ_SEPARATOR;
    }
    {NEXT_PROP_SEPARATOR} {
        inObjValueState = false;

        System.err.printf("Next property separator %s was found\n", yytext());
        yybegin(PROP_KEY);
        return TurtleTokenTypes.KEY_VALUE_SEPARATOR;
    }
}

[^] { return TurtleTokenTypes.BAD_CHARACTER;  }