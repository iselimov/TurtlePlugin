/* The following code was generated by JFlex 1.7.0 */

package com.defrag;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>/home/defrag/Projects/TurtlePlugin/resources/turtle.flex</tt>
 */
class _TurtleLexer implements FlexLexer {

    /**
     * This character denotes the end of file
     */
    public static final int YYEOF = -1;

    /**
     * initial size of the lookahead buffer
     */
    private static final int ZZ_BUFFERSIZE = 16384;

    /**
     * lexical states
     */
    public static final int YYINITIAL = 0;
    public static final int PREFIX_KEY = 2;
    public static final int PREFIX_VALUE = 4;
    public static final int SUBJECT_VALUE = 6;
    public static final int PROP_KEY = 8;
    public static final int PROP_VALUE = 10;
    public static final int OBJ_KEY = 12;
    public static final int OBJ_VALUE = 14;
    public static final int OBJ_SEPARATOR = 16;

    /**
     * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
     * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
     * at the beginning of a line
     * l is of the form l = 2*k, k a non negative integer
     */
    private static final int ZZ_LEXSTATE[] = {
            0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7,
            8, 8
    };

    /**
     * Translates characters to character classes
     */
    private static final String ZZ_CMAP_PACKED =
            "\11\0\1\1\1\13\2\1\1\13\22\0\1\6\13\0\1\14\1\0" +
                    "\1\4\1\0\12\2\1\3\1\12\1\7\1\0\1\10\1\0\1\5" +
                    "\32\2\4\0\1\2\1\0\1\11\31\2\12\0\1\1\32\0\1\1" +
                    "\11\0\1\2\12\0\1\2\4\0\1\2\5\0\27\2\1\0\37\2" +
                    "\1\0\u01ca\2\4\0\14\2\16\0\5\2\7\0\1\2\1\0\1\2" +
                    "\21\0\165\2\1\0\2\2\2\0\4\2\1\0\1\2\6\0\1\2" +
                    "\1\0\3\2\1\0\1\2\1\0\24\2\1\0\123\2\1\0\213\2" +
                    "\1\0\255\2\1\0\46\2\2\0\1\2\7\0\47\2\11\0\55\2" +
                    "\1\0\1\2\1\0\2\2\1\0\2\2\1\0\1\2\10\0\33\2" +
                    "\5\0\3\2\35\0\13\2\5\0\112\2\4\0\146\2\1\0\10\2" +
                    "\2\0\12\2\1\0\23\2\2\0\1\2\20\0\73\2\2\0\145\2" +
                    "\16\0\66\2\4\0\1\2\5\0\56\2\22\0\34\2\104\0\25\2" +
                    "\1\0\10\2\26\0\16\2\1\0\201\2\2\0\12\2\1\0\23\2" +
                    "\1\0\10\2\2\0\2\2\2\0\26\2\1\0\7\2\1\0\1\2" +
                    "\3\0\4\2\2\0\11\2\2\0\2\2\2\0\4\2\10\0\1\2" +
                    "\4\0\2\2\1\0\5\2\2\0\14\2\17\0\3\2\1\0\6\2" +
                    "\4\0\2\2\2\0\26\2\1\0\7\2\1\0\2\2\1\0\2\2" +
                    "\1\0\2\2\2\0\1\2\1\0\5\2\4\0\2\2\2\0\3\2" +
                    "\3\0\1\2\7\0\4\2\1\0\1\2\7\0\20\2\13\0\3\2" +
                    "\1\0\11\2\1\0\3\2\1\0\26\2\1\0\7\2\1\0\2\2" +
                    "\1\0\5\2\2\0\12\2\1\0\3\2\1\0\3\2\2\0\1\2" +
                    "\17\0\4\2\2\0\12\2\11\0\1\2\7\0\3\2\1\0\10\2" +
                    "\2\0\2\2\2\0\26\2\1\0\7\2\1\0\2\2\1\0\5\2" +
                    "\2\0\11\2\2\0\2\2\2\0\3\2\10\0\2\2\4\0\2\2" +
                    "\1\0\5\2\2\0\12\2\1\0\1\2\20\0\2\2\1\0\6\2" +
                    "\3\0\3\2\1\0\4\2\3\0\2\2\1\0\1\2\1\0\2\2" +
                    "\3\0\2\2\3\0\3\2\3\0\14\2\4\0\5\2\3\0\3\2" +
                    "\1\0\4\2\2\0\1\2\6\0\1\2\16\0\12\2\20\0\4\2" +
                    "\1\0\10\2\1\0\3\2\1\0\27\2\1\0\20\2\3\0\10\2" +
                    "\1\0\3\2\1\0\4\2\7\0\2\2\1\0\3\2\5\0\4\2" +
                    "\2\0\12\2\20\0\4\2\1\0\10\2\1\0\3\2\1\0\27\2" +
                    "\1\0\12\2\1\0\5\2\2\0\11\2\1\0\3\2\1\0\4\2" +
                    "\7\0\2\2\7\0\1\2\1\0\4\2\2\0\12\2\1\0\2\2" +
                    "\16\0\3\2\1\0\10\2\1\0\3\2\1\0\51\2\2\0\10\2" +
                    "\1\0\3\2\1\0\5\2\5\0\4\2\7\0\5\2\2\0\12\2" +
                    "\12\0\6\2\2\0\2\2\1\0\22\2\3\0\30\2\1\0\11\2" +
                    "\1\0\1\2\2\0\7\2\3\0\1\2\4\0\6\2\1\0\1\2" +
                    "\1\0\10\2\6\0\12\2\2\0\2\2\15\0\72\2\5\0\17\2" +
                    "\1\0\12\2\47\0\2\2\1\0\1\2\2\0\2\2\1\0\1\2" +
                    "\2\0\1\2\6\0\4\2\1\0\7\2\1\0\3\2\1\0\1\2" +
                    "\1\0\1\2\2\0\2\2\1\0\15\2\1\0\3\2\2\0\5\2" +
                    "\1\0\1\2\1\0\6\2\2\0\12\2\2\0\4\2\40\0\1\2" +
                    "\27\0\2\2\6\0\12\2\13\0\1\2\1\0\1\2\1\0\1\2" +
                    "\4\0\12\2\1\0\44\2\4\0\24\2\1\0\22\2\1\0\44\2" +
                    "\11\0\1\2\71\0\112\2\6\0\116\2\2\0\46\2\1\0\1\2" +
                    "\5\0\1\2\2\0\53\2\1\0\u014d\2\1\0\4\2\2\0\7\2" +
                    "\1\0\1\2\1\0\4\2\2\0\51\2\1\0\4\2\2\0\41\2" +
                    "\1\0\4\2\2\0\7\2\1\0\1\2\1\0\4\2\2\0\17\2" +
                    "\1\0\71\2\1\0\4\2\2\0\103\2\2\0\3\2\40\0\20\2" +
                    "\20\0\126\2\2\0\6\2\3\0\u026c\2\2\0\21\2\1\1\32\2" +
                    "\5\0\113\2\3\0\13\2\7\0\15\2\1\0\7\2\13\0\25\2" +
                    "\13\0\24\2\14\0\15\2\1\0\3\2\1\0\2\2\14\0\124\2" +
                    "\3\0\1\2\4\0\2\2\2\0\12\2\41\0\3\2\2\0\12\2" +
                    "\6\0\130\2\10\0\53\2\5\0\106\2\12\0\37\2\1\0\14\2" +
                    "\4\0\14\2\12\0\50\2\2\0\5\2\13\0\54\2\4\0\32\2" +
                    "\6\0\12\2\46\0\34\2\4\0\77\2\1\0\35\2\2\0\13\2" +
                    "\6\0\12\2\15\0\1\2\10\0\17\2\101\0\114\2\4\0\12\2" +
                    "\21\0\11\2\14\0\164\2\14\0\70\2\10\0\12\2\3\0\61\2" +
                    "\2\0\11\2\107\0\3\2\1\0\43\2\1\0\2\2\6\0\366\2" +
                    "\5\0\u011b\2\2\0\6\2\2\0\46\2\2\0\6\2\2\0\10\2" +
                    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\37\2\2\0\65\2" +
                    "\1\0\7\2\1\0\1\2\3\0\3\2\1\0\7\2\3\0\4\2" +
                    "\2\0\6\2\4\0\15\2\5\0\3\2\1\0\7\2\3\0\13\1" +
                    "\35\0\2\1\5\0\1\1\17\0\2\2\23\0\1\2\12\0\1\1" +
                    "\21\0\1\2\15\0\1\2\20\0\15\2\63\0\41\2\21\0\1\2" +
                    "\4\0\1\2\2\0\12\2\1\0\1\2\3\0\5\2\6\0\1\2" +
                    "\1\0\1\2\1\0\1\2\1\0\4\2\1\0\13\2\2\0\4\2" +
                    "\5\0\5\2\4\0\1\2\21\0\51\2\u032d\0\64\2\u0716\0\57\2" +
                    "\1\0\57\2\1\0\205\2\6\0\11\2\14\0\46\2\1\0\1\2" +
                    "\5\0\1\2\2\0\70\2\7\0\1\2\17\0\30\2\11\0\7\2" +
                    "\1\0\7\2\1\0\7\2\1\0\7\2\1\0\7\2\1\0\7\2" +
                    "\1\0\7\2\1\0\7\2\1\0\40\2\57\0\1\2\u01d0\0\1\1" +
                    "\4\0\3\2\31\0\17\2\1\0\5\2\2\0\5\2\4\0\126\2" +
                    "\2\0\2\2\2\0\3\2\1\0\132\2\1\0\4\2\5\0\51\2" +
                    "\3\0\136\2\21\0\33\2\65\0\20\2\u0200\0\u19b6\2\112\0\u51d6\2" +
                    "\52\0\u048d\2\103\0\56\2\2\0\u010d\2\3\0\34\2\24\0\63\2" +
                    "\1\0\12\2\1\0\163\2\45\0\11\2\2\0\147\2\2\0\44\2" +
                    "\1\0\10\2\77\0\61\2\30\0\64\2\14\0\106\2\12\0\12\2" +
                    "\6\0\30\2\3\0\1\2\1\0\1\2\2\0\56\2\2\0\44\2" +
                    "\14\0\35\2\3\0\101\2\16\0\13\2\6\0\37\2\1\0\67\2" +
                    "\11\0\16\2\2\0\12\2\6\0\27\2\3\0\111\2\30\0\3\2" +
                    "\2\0\20\2\2\0\5\2\12\0\6\2\2\0\6\2\2\0\6\2" +
                    "\11\0\7\2\1\0\7\2\1\0\53\2\1\0\12\2\12\0\173\2" +
                    "\1\0\2\2\2\0\12\2\6\0\u2ba4\2\14\0\27\2\4\0\61\2" +
                    "\u2104\0\u016e\2\2\0\152\2\46\0\7\2\14\0\5\2\5\0\14\2" +
                    "\1\0\15\2\1\0\5\2\1\0\1\2\1\0\2\2\1\0\2\2" +
                    "\1\0\154\2\41\0\u016b\2\22\0\100\2\2\0\66\2\50\0\14\2" +
                    "\4\0\20\2\20\0\20\2\3\0\2\2\30\0\3\2\40\0\5\2" +
                    "\1\0\207\2\23\0\12\2\7\0\32\2\4\0\1\2\1\0\32\2" +
                    "\13\0\131\2\3\0\6\2\2\0\6\2\2\0\6\2\2\0\3\2" +
                    "\43\0\14\2\1\0\32\2\1\0\23\2\1\0\2\2\1\0\17\2" +
                    "\2\0\16\2\42\0\173\2\105\0\65\2\210\0\1\2\202\0\35\2" +
                    "\3\0\61\2\17\0\1\2\37\0\40\2\20\0\33\2\5\0\53\2" +
                    "\5\0\36\2\2\0\44\2\4\0\10\2\1\0\5\2\52\0\236\2" +
                    "\2\0\12\2\6\0\44\2\4\0\44\2\4\0\50\2\10\0\64\2" +
                    "\234\0\u0137\2\11\0\26\2\12\0\10\2\230\0\6\2\2\0\1\2" +
                    "\1\0\54\2\1\0\2\2\3\0\1\2\2\0\27\2\12\0\27\2" +
                    "\11\0\37\2\101\0\23\2\1\0\2\2\12\0\26\2\12\0\32\2" +
                    "\106\0\70\2\6\0\2\2\100\0\4\2\1\0\2\2\5\0\10\2" +
                    "\1\0\3\2\1\0\33\2\4\0\3\2\4\0\1\2\40\0\35\2" +
                    "\3\0\35\2\43\0\10\2\1\0\36\2\31\0\66\2\12\0\26\2" +
                    "\12\0\23\2\15\0\22\2\156\0\111\2\67\0\63\2\15\0\63\2" +
                    "\u030d\0\107\2\37\0\12\2\17\0\74\2\25\0\31\2\7\0\12\2" +
                    "\6\0\65\2\1\0\12\2\20\0\44\2\2\0\1\2\11\0\105\2" +
                    "\5\0\3\2\3\0\13\2\1\0\1\2\43\0\22\2\1\0\45\2" +
                    "\6\0\1\2\101\0\7\2\1\0\1\2\1\0\4\2\1\0\17\2" +
                    "\1\0\12\2\7\0\73\2\5\0\12\2\6\0\4\2\1\0\10\2" +
                    "\2\0\2\2\2\0\26\2\1\0\7\2\1\0\2\2\1\0\5\2" +
                    "\2\0\11\2\2\0\2\2\2\0\3\2\2\0\1\2\6\0\1\2" +
                    "\5\0\7\2\2\0\7\2\3\0\5\2\213\0\113\2\5\0\12\2" +
                    "\46\0\106\2\1\0\1\2\10\0\12\2\246\0\66\2\2\0\11\2" +
                    "\27\0\6\2\42\0\101\2\3\0\1\2\13\0\12\2\46\0\70\2" +
                    "\10\0\12\2\66\0\32\2\3\0\17\2\4\0\12\2\u0166\0\112\2" +
                    "\25\0\1\2\u01c0\0\71\2\u0107\0\11\2\1\0\55\2\1\0\11\2" +
                    "\17\0\12\2\30\0\36\2\2\0\26\2\1\0\16\2\u0349\0\u039a\2" +
                    "\146\0\157\2\21\0\304\2\u0abc\0\u042f\2\u0fd1\0\u0247\2\u21b9\0\u0239\2" +
                    "\7\0\37\2\1\0\12\2\146\0\36\2\2\0\5\2\13\0\67\2" +
                    "\11\0\4\2\14\0\12\2\11\0\25\2\5\0\23\2\u0370\0\105\2" +
                    "\13\0\57\2\20\0\21\2\100\0\1\2\37\0\u17ed\2\23\0\u02f3\2" +
                    "\u250d\0\2\2\u0bfe\0\153\2\5\0\15\2\3\0\11\2\7\0\12\2" +
                    "\3\0\2\2\u14c6\0\5\2\3\0\6\2\10\0\10\2\2\0\7\2" +
                    "\36\0\4\2\224\0\3\2\u01bb\0\125\2\1\0\107\2\1\0\2\2" +
                    "\2\0\1\2\2\0\2\2\2\0\4\2\1\0\14\2\1\0\1\2" +
                    "\1\0\7\2\1\0\101\2\1\0\4\2\2\0\10\2\1\0\7\2" +
                    "\1\0\34\2\1\0\4\2\1\0\5\2\1\0\1\2\3\0\7\2" +
                    "\1\0\u0154\2\2\0\31\2\1\0\31\2\1\0\37\2\1\0\31\2" +
                    "\1\0\37\2\1\0\31\2\1\0\37\2\1\0\31\2\1\0\37\2" +
                    "\1\0\31\2\1\0\10\2\2\0\62\2\u0200\0\67\2\4\0\62\2" +
                    "\10\0\1\2\16\0\1\2\26\0\5\2\1\0\17\2\u0550\0\7\2" +
                    "\1\0\21\2\2\0\7\2\1\0\2\2\1\0\5\2\u07d5\0\305\2" +
                    "\13\0\7\2\51\0\113\2\5\0\12\2\u04a6\0\4\2\1\0\33\2" +
                    "\1\0\2\2\1\0\1\2\2\0\1\2\1\0\12\2\1\0\4\2" +
                    "\1\0\1\2\1\0\1\2\6\0\1\2\4\0\1\2\1\0\1\2" +
                    "\1\0\1\2\1\0\3\2\1\0\2\2\1\0\1\2\2\0\1\2" +
                    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2\1\0\2\2" +
                    "\1\0\1\2\2\0\4\2\1\0\7\2\1\0\4\2\1\0\4\2" +
                    "\1\0\1\2\1\0\12\2\1\0\21\2\5\0\3\2\1\0\5\2" +
                    "\1\0\21\2\u0274\0\32\2\6\0\32\2\6\0\32\2\u0e76\0\ua6d7\2" +
                    "\51\0\u1035\2\13\0\336\2\2\0\u1682\2\u295e\0\u021e\2\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u06ed\0" +
                    "\360\2\uffff\0\uffff\0\ufe12\0";

    /**
     * Translates characters to character classes
     */
    private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

    /**
     * Translates DFA states to action switch labels.
     */
    private static final int[] ZZ_ACTION = zzUnpackAction();

    private static final String ZZ_ACTION_PACKED_0 =
            "\11\0\13\1\4\2\1\1\1\3\1\4\1\5\1\6" +
                    "\1\7\1\0\1\10\1\11\5\0\1\12\1\0\1\13" +
                    "\1\0\1\14\1\0\1\15\1\0\1\16\1\2\4\0" +
                    "\1\17\2\0\1\2\2\0\1\10\1\0\1\20\1\0" +
                    "\1\13\1\2\1\16\1\0\1\20";

    private static int[] zzUnpackAction() {
        int[] result = new int[67];
        int offset = 0;
        offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAction(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /**
     * Translates a state to a row index in the transition table
     */
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

    private static final String ZZ_ROWMAP_PACKED_0 =
            "\0\0\0\15\0\32\0\47\0\64\0\101\0\116\0\133" +
                    "\0\150\0\165\0\202\0\217\0\234\0\251\0\266\0\303" +
                    "\0\320\0\335\0\352\0\367\0\u0104\0\u0111\0\u011e\0\u012b" +
                    "\0\u0138\0\u0145\0\165\0\165\0\165\0\u0152\0\202\0\165" +
                    "\0\217\0\u015f\0\u016c\0\251\0\u0179\0\303\0\u0186\0\320" +
                    "\0\165\0\u0193\0\165\0\367\0\u01a0\0\u0138\0\165\0\u01ad" +
                    "\0\u01ba\0\u01c7\0\u01d4\0\u01e1\0\165\0\u01ee\0\u01fb\0\u0208" +
                    "\0\u0215\0\u0222\0\u015f\0\u022f\0\u0179\0\u023c\0\u0193\0\u0249" +
                    "\0\u01ba\0\u0256\0\165";

    private static int[] zzUnpackRowMap() {
        int[] result = new int[67];
        int offset = 0;
        offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackRowMap(String packed, int offset, int[] result) {
        int i = 0;  /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int high = packed.charAt(i++) << 16;
            result[j++] = high | packed.charAt(i++);
        }
        return j;
    }

    /**
     * The transition table of the DFA
     */
    private static final int[] ZZ_TRANS = zzUnpackTrans();

    private static final String ZZ_TRANS_PACKED_0 =
            "\2\12\1\13\2\12\1\14\1\12\1\15\1\12\1\13" +
                    "\11\12\1\16\15\12\1\17\7\12\1\20\6\12\1\20" +
                    "\5\12\1\21\4\12\1\22\1\12\1\23\5\12\1\24" +
                    "\6\12\1\24\3\12\1\25\1\26\1\27\2\12\1\25" +
                    "\1\26\1\30\1\25\1\27\1\12\1\31\3\12\1\32" +
                    "\6\12\1\32\6\12\1\33\1\34\5\12\1\35\1\12" +
                    "\1\36\17\0\1\37\1\40\5\0\1\37\5\0\1\41" +
                    "\6\0\1\41\3\0\1\42\1\0\4\42\1\0\4\42" +
                    "\1\0\1\42\2\0\1\43\3\0\1\44\2\0\1\43" +
                    "\3\0\1\45\1\0\4\45\1\0\4\45\1\0\1\45" +
                    "\2\0\1\46\3\0\1\47\2\0\1\46\5\0\1\50" +
                    "\1\51\5\0\1\50\3\0\1\52\1\0\4\52\1\0" +
                    "\4\52\1\0\1\52\1\0\1\53\1\50\1\51\2\0" +
                    "\1\53\2\0\1\50\1\0\1\53\3\0\1\54\3\0" +
                    "\1\55\2\0\1\54\3\0\3\25\2\0\5\25\3\0" +
                    "\1\25\1\26\1\27\2\0\1\25\1\26\1\30\1\25" +
                    "\1\27\1\0\1\56\1\0\2\25\1\27\1\57\1\0" +
                    "\4\25\1\27\3\0\1\60\1\25\1\60\2\61\1\60" +
                    "\1\25\3\60\1\61\1\0\1\61\1\0\1\56\1\62" +
                    "\3\0\1\56\1\63\1\0\1\62\1\0\1\56\3\0" +
                    "\1\32\6\0\1\32\4\0\1\36\4\0\1\36\4\0" +
                    "\1\36\1\0\1\42\1\0\4\42\1\0\1\42\1\64" +
                    "\2\42\1\0\1\42\2\0\1\43\1\65\5\0\1\43" +
                    "\3\0\1\45\1\0\4\45\1\0\1\45\1\66\2\45" +
                    "\1\0\1\45\6\0\1\47\6\0\1\52\1\0\4\52" +
                    "\1\0\1\52\1\67\2\52\1\0\1\52\6\0\1\55" +
                    "\6\0\1\60\1\25\1\60\2\61\1\60\1\25\1\60" +
                    "\1\70\1\60\1\61\1\0\2\61\1\0\4\61\1\0" +
                    "\1\61\1\71\2\61\1\0\1\61\2\0\1\62\1\57" +
                    "\5\0\1\62\3\0\1\61\1\0\4\61\1\0\4\61" +
                    "\1\0\1\61\1\42\1\72\1\42\1\73\2\42\1\72" +
                    "\1\42\1\64\2\42\1\72\1\42\1\45\1\74\2\45" +
                    "\1\75\1\45\1\74\1\45\1\66\2\45\1\74\1\45" +
                    "\1\52\1\76\1\52\1\77\2\52\1\76\1\52\1\67" +
                    "\2\52\1\76\1\52\1\60\1\100\1\60\1\101\1\61" +
                    "\1\60\1\100\1\60\1\70\1\60\1\61\1\102\2\61" +
                    "\1\102\1\61\1\101\2\61\1\102\1\61\1\71\2\61" +
                    "\1\102\1\61\1\0\1\72\1\0\1\40\2\0\1\72" +
                    "\4\0\1\72\2\0\1\74\2\0\1\103\1\0\1\74" +
                    "\4\0\1\74\2\0\1\76\1\0\1\51\2\0\1\76" +
                    "\4\0\1\76\1\0\1\25\1\100\1\25\1\57\1\0" +
                    "\1\25\1\100\3\25\1\0\1\102\2\0\1\102\1\0" +
                    "\1\57\2\0\1\102\4\0\1\102\1\0";

    private static int[] zzUnpackTrans() {
        int[] result = new int[611];
        int offset = 0;
        offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackTrans(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            value--;
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /* error codes */
    private static final int ZZ_UNKNOWN_ERROR = 0;
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;

    /* error messages for the codes above */
    private static final String ZZ_ERROR_MSG[] = {
            "Unknown internal scanner error",
            "Error: could not match input",
            "Error: pushback value was too large"
    };

    /**
     * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
     */
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

    private static final String ZZ_ATTRIBUTE_PACKED_0 =
            "\11\0\1\11\20\1\3\11\1\1\1\0\1\11\1\1" +
                    "\5\0\1\1\1\0\1\11\1\0\1\11\1\0\1\1" +
                    "\1\0\1\11\1\1\4\0\1\11\2\0\1\1\2\0" +
                    "\1\1\1\0\1\1\1\0\3\1\1\0\1\11";

    private static int[] zzUnpackAttribute() {
        int[] result = new int[67];
        int offset = 0;
        offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAttribute(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }

    /**
     * the input device
     */
    private java.io.Reader zzReader;

    /**
     * the current state of the DFA
     */
    private int zzState;

    /**
     * the current lexical state
     */
    private int zzLexicalState = YYINITIAL;

    /**
     * this buffer contains the current text to be matched and is
     * the source of the yytext() string
     */
    private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

    /**
     * the textposition at the last accepting state
     */
    private int zzMarkedPos;

    /**
     * the current text position in the buffer
     */
    private int zzCurrentPos;

    /**
     * startRead marks the beginning of the yytext() string in the buffer
     */
    private int zzStartRead;

    /**
     * endRead marks the last character in the buffer, that has been read
     * from input
     */
    private int zzEndRead;

    /**
     * number of newlines encountered up to the start of the matched text
     */
    private int yyline;

    /**
     * the number of characters up to the start of the matched text
     */
    private int yychar;

    /**
     * the number of characters from the last newline up to the start of the
     * matched text
     */
    private int yycolumn;

    /**
     * zzAtBOL == true iff the scanner is currently at the beginning of a line
     */
    private boolean zzAtBOL = true;

    /**
     * zzAtEOF == true iff the scanner is at the EOF
     */
    private boolean zzAtEOF;

    /**
     * denotes if the user-EOF-code has already been executed
     */
    private boolean zzEOFDone;

    /**
     * The number of occupied positions in zzBuffer beyond zzEndRead.
     * When a lead/high surrogate has been read from the input stream
     * into the final zzBuffer position, this will have a value of 1;
     * otherwise, it will have a value of 0.
     */
    private int zzFinalHighSurrogate = 0;

    /* user code: */
    private static final String PREFIX_PATTERN = "@prefix";
    private boolean inObjValueState = false;


    /**
     * Creates a new scanner
     *
     * @param in the java.io.Reader to read input from.
     */
    _TurtleLexer(java.io.Reader in) {
        this.zzReader = in;
    }


    /**
     * Unpacks the compressed character translation table.
     *
     * @param packed the packed character translation table
     * @return the unpacked character translation table
     */
    private static char[] zzUnpackCMap(String packed) {
        char[] map = new char[0x110000];
        int i = 0;  /* index in packed string  */
        int j = 0;  /* index in unpacked array */
        while (i < 2808) {
            int count = packed.charAt(i++);
            char value = packed.charAt(i++);
            do map[j++] = value; while (--count > 0);
        }
        return map;
    }


    /**
     * Refills the input buffer.
     *
     * @return <code>false</code>, iff there was new input.
     * @throws java.io.IOException if any I/O-Error occurs
     */
    private boolean zzRefill() throws java.io.IOException {
        return true;
    }

    public final int getTokenStart() {
        return zzStartRead;
    }

    public final int getTokenEnd() {
        return getTokenStart() + yylength();
    }

    public void reset(CharSequence buffer, int start, int end, int initialState) {
        zzBuffer = buffer.toString().toCharArray();
        zzCurrentPos = zzMarkedPos = zzStartRead = start;
        zzAtEOF = false;
        zzAtBOL = true;
        zzEndRead = end;
        yybegin(initialState);
    }


    /**
     * Closes the input stream.
     */
    public final void yyclose() throws java.io.IOException {
        zzAtEOF = true;            /* indicate end of file */
        zzEndRead = zzStartRead;  /* invalidate buffer    */

        if (zzReader != null)
            zzReader.close();
    }


    /**
     * Resets the scanner to read from a new input stream.
     * Does not close the old reader.
     * <p>
     * All internal variables are reset, the old input stream
     * <b>cannot</b> be reused (internal buffer is discarded and lost).
     * Lexical state is set to <tt>ZZ_INITIAL</tt>.
     * <p>
     * Internal scan buffer is resized down to its initial length, if it has grown.
     *
     * @param reader the new input stream
     */
    public final void yyreset(java.io.Reader reader) {
        zzReader = reader;
        zzAtBOL = true;
        zzAtEOF = false;
        zzEOFDone = false;
        zzEndRead = zzStartRead = 0;
        zzCurrentPos = zzMarkedPos = 0;
        zzFinalHighSurrogate = 0;
        yyline = yychar = yycolumn = 0;
        zzLexicalState = YYINITIAL;
        if (zzBuffer.length > ZZ_BUFFERSIZE)
            zzBuffer = new char[ZZ_BUFFERSIZE];
    }


    /**
     * Returns the current lexical state.
     */
    public final int yystate() {
        return zzLexicalState;
    }


    /**
     * Enters a new lexical state
     *
     * @param newState the new lexical state
     */
    public final void yybegin(int newState) {
        zzLexicalState = newState;
    }


    /**
     * Returns the text matched by the current regular expression.
     */
    public final String yytext() {
        return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
    }


    /**
     * Returns the character at position <tt>pos</tt> from the
     * matched text.
     * <p>
     * It is equivalent to yytext().charAt(pos), but faster
     *
     * @param pos the position of the character to fetch.
     *            A value from 0 to yylength()-1.
     * @return the character at position pos
     */
    public final char yycharat(int pos) {
        return zzBuffer[zzStartRead + pos];
    }


    /**
     * Returns the length of the matched text region.
     */
    public final int yylength() {
        return zzMarkedPos - zzStartRead;
    }


    /**
     * Reports an error that occured while scanning.
     * <p>
     * In a wellformed scanner (no or only correct usage of
     * yypushback(int) and a match-all fallback rule) this method
     * will only be called with things that "Can't Possibly Happen".
     * If this method is called, something is seriously wrong
     * (e.g. a JFlex bug producing a faulty scanner etc.).
     * <p>
     * Usual syntax/scanner level error handling should be done
     * in error fallback rules.
     *
     * @param errorCode the code of the errormessage to display
     */
    private void zzScanError(int errorCode) {
        String message;
        try {
            message = ZZ_ERROR_MSG[errorCode];
        } catch (ArrayIndexOutOfBoundsException e) {
            message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
        }

        throw new Error(message);
    }


    /**
     * Pushes the specified amount of characters back into the input stream.
     * <p>
     * They will be read again by then next call of the scanning method
     *
     * @param number the number of characters to be read again.
     *               This number must not be greater than yylength()!
     */
    public void yypushback(int number) {
        if (number > yylength())
            zzScanError(ZZ_PUSHBACK_2BIG);

        zzMarkedPos -= number;
    }


    /**
     * Resumes scanning until the next regular expression is matched,
     * the end of input is encountered or an I/O-Error occurs.
     *
     * @return the next token
     * @throws java.io.IOException if any I/O-Error occurs
     */
    public IElementType advance() throws java.io.IOException {
        int zzInput;
        int zzAction;

        // cached fields:
        int zzCurrentPosL;
        int zzMarkedPosL;
        int zzEndReadL = zzEndRead;
        char[] zzBufferL = zzBuffer;
        char[] zzCMapL = ZZ_CMAP;

        int[] zzTransL = ZZ_TRANS;
        int[] zzRowMapL = ZZ_ROWMAP;
        int[] zzAttrL = ZZ_ATTRIBUTE;

        while (true) {
            zzMarkedPosL = zzMarkedPos;

            zzAction = -1;

            zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

            zzState = ZZ_LEXSTATE[zzLexicalState];

            // set up zzAction for empty match case:
            int zzAttributes = zzAttrL[zzState];
            if ((zzAttributes & 1) == 1) {
                zzAction = zzState;
            }


            zzForAction:
            {
                while (true) {

                    if (zzCurrentPosL < zzEndReadL) {
                        zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
                        zzCurrentPosL += Character.charCount(zzInput);
                    } else if (zzAtEOF) {
                        zzInput = YYEOF;
                        break zzForAction;
                    } else {
                        // store back cached positions
                        zzCurrentPos = zzCurrentPosL;
                        zzMarkedPos = zzMarkedPosL;
                        boolean eof = zzRefill();
                        // get translated positions and possibly new buffer
                        zzCurrentPosL = zzCurrentPos;
                        zzMarkedPosL = zzMarkedPos;
                        zzBufferL = zzBuffer;
                        zzEndReadL = zzEndRead;
                        if (eof) {
                            zzInput = YYEOF;
                            break zzForAction;
                        } else {
                            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
                            zzCurrentPosL += Character.charCount(zzInput);
                        }
                    }
                    int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
                    if (zzNext == -1) break zzForAction;
                    zzState = zzNext;

                    zzAttributes = zzAttrL[zzState];
                    if ((zzAttributes & 1) == 1) {
                        zzAction = zzState;
                        zzMarkedPosL = zzCurrentPosL;
                        if ((zzAttributes & 8) == 8) break zzForAction;
                    }

                }
            }

            // store back cached position
            zzMarkedPos = zzMarkedPosL;

            if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
                zzAtEOF = true;
                return null;
            } else {
                switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
                    case 1: {
                        return TurtleTokenTypes.BAD_CHARACTER;
                    }
                    // fall through
                    case 17:
                        break;
                    case 2: {
                        inObjValueState = true;

                        System.err.printf("Object literal value %s was found\n", yytext());
                        yybegin(OBJ_SEPARATOR);
                        return TurtleTokenTypes.OBJ_LITERAL_VALUE;
                    }
                    // fall through
                    case 18:
                        break;
                    case 3: {
                        System.err.printf("Object value %s was found\n", yytext());
                        yybegin(OBJ_SEPARATOR);
                        return TurtleTokenTypes.PROP_VALUE;
                    }
                    // fall through
                    case 19:
                        break;
                    case 4: {
                        yybegin(OBJ_KEY);
                        return TurtleTokenTypes.OBJ_LITERAL_VALUE;
                    }
                    // fall through
                    case 20:
                        break;
                    case 5: {
                        inObjValueState = false;

                        System.err.printf("Dot %s was found\n", yytext());
                        yybegin(YYINITIAL);
                        return TurtleTokenTypes.DOT;
                    }
                    // fall through
                    case 21:
                        break;
                    case 6: {
                        inObjValueState = false;

                        System.err.printf("Next property separator %s was found\n", yytext());
                        yybegin(PROP_KEY);
                        return TurtleTokenTypes.KEY_VALUE_SEPARATOR;
                    }
                    // fall through
                    case 22:
                        break;
                    case 7: {
                        inObjValueState = false;

                        System.err.printf("Next object separator %s was found\n", yytext());
                        yybegin(OBJ_KEY);
                        return TurtleTokenTypes.NEXT_OBJ_SEPARATOR;
                    }
                    // fall through
                    case 23:
                        break;
                    case 8: {
                        System.err.printf("Subject %s was found\n", yytext());
                        yybegin(SUBJECT_VALUE);
                        return TurtleTokenTypes.SUBJECT_KEY;
                    }
                    // fall through
                    case 24:
                        break;
                    case 9: {
                        System.err.printf("Prefix %s was found\n", yytext());
                        if (PREFIX_PATTERN.equals(yytext())) {
                            yybegin(PREFIX_KEY);
                            return TurtleTokenTypes.PREFIX;
                        }
                        return TurtleTokenTypes.BAD_CHARACTER;
                    }
                    // fall through
                    case 25:
                        break;
                    case 10: {
                        System.err.printf("Subject value %s was found\n", yytext());
                        yybegin(PROP_KEY);
                        return TurtleTokenTypes.SUBJECT_VALUE;
                    }
                    // fall through
                    case 26:
                        break;
                    case 11: {
                        System.err.printf("Property key %s was found\n", yytext());
                        yybegin(PROP_VALUE);
                        return TurtleTokenTypes.PROP_KEY;
                    }
                    // fall through
                    case 27:
                        break;
                    case 12: {
                        System.err.printf("Property key %s was found\n", yytext());
                        yybegin(OBJ_KEY);
                        return TurtleTokenTypes.PROP_VALUE;
                    }
                    // fall through
                    case 28:
                        break;
                    case 13: {
                        System.err.printf("Property value %s was found\n", yytext());
                        yybegin(OBJ_KEY);
                        return TurtleTokenTypes.PROP_VALUE;
                    }
                    // fall through
                    case 29:
                        break;
                    case 14: {
                        if (inObjValueState) {
                            return TurtleTokenTypes.OBJ_LITERAL_VALUE;
                        }

                        System.err.printf("Object key %s was found\n", yytext());
                        yybegin(OBJ_VALUE);
                        return TurtleTokenTypes.OBJ_KEY;
                    }
                    // fall through
                    case 30:
                        break;
                    case 15: {
                        System.err.printf("Prefix key %s was found\n", yytext());
                        yybegin(PREFIX_VALUE);
                        return TurtleTokenTypes.PREFIX_KEY;
                    }
                    // fall through
                    case 31:
                        break;
                    case 16: {
                        System.err.printf("Prefix value %s was found\n", yytext());
                        yybegin(YYINITIAL);
                        return TurtleTokenTypes.PREFIX_VALUE;
                    }
                    // fall through
                    case 32:
                        break;
                    default:
                        zzScanError(ZZ_NO_MATCH);
                }
            }
        }
    }


}