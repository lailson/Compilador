// $ANTLR : "Recognizer.g" -> "RecognizerLexer.java"$

	package com.anlugifa.editor.parser;
	import javax.swing.text.StyledDocument;
	import javax.swing.text.Style;
	import javax.swing.text.Element;
	import com.anlugifa.editor.base.*;
	import javax.swing.text.BadLocationException;
	import com.anlugifa.editor.xml.*;

public interface RecognizerParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int STRING_LIT = 4;
	int SL_COMMENT = 5;
	int ML_COMMENT = 6;
	int INTLT = 7;
	int HEX_DIGIT = 8;
	int CHARLIT = 9;
	int LITERAL_int = 10;
	int LITERAL_float = 11;
	int LITERAL_double = 12;
	int LITERAL_byte = 13;
	int LITERAL_char = 14;
	int LITERAL_boolean = 15;
	int LITERAL_short = 16;
	int LITERAL_long = 17;
	int LITERAL_abstract = 18;
	int LITERAL_continue = 19;
	int LITERAL_for = 20;
	int LITERAL_new = 21;
	int LITERAL_switch = 22;
	int LITERAL_assert = 23;
	int LITERAL_default = 24;
	int LITERAL_goto = 25;
	int LITERAL_package = 26;
	int LITERAL_synchronized = 27;
	int LITERAL_do = 28;
	int LITERAL_if = 29;
	int LITERAL_private = 30;
	int LITERAL_this = 31;
	int LITERAL_break = 32;
	int LITERAL_implements = 33;
	int LITERAL_protected = 34;
	int LITERAL_throw = 35;
	int LITERAL_else = 36;
	int LITERAL_import = 37;
	int LITERAL_public = 38;
	int LITERAL_throws = 39;
	int LITERAL_case = 40;
	int LITERAL_enum = 41;
	int LITERAL_instanceof = 42;
	int LITERAL_return = 43;
	int LITERAL_transient = 44;
	int LITERAL_catch = 45;
	int LITERAL_extends = 46;
	int LITERAL_try = 47;
	int LITERAL_final = 48;
	int LITERAL_interface = 49;
	int LITERAL_static = 50;
	int LITERAL_class = 51;
	int LITERAL_finally = 52;
	int LITERAL_strictfp = 53;
	int LITERAL_volatile = 54;
	int LITERAL_const = 55;
	int LITERAL_native = 56;
	int LITERAL_super = 57;
	int LITERAL_while = 58;
	int LITERAL_void = 59;
	int WS = 60;
	int DIGIT = 61;
	int LETTER = 62;
	int Escape = 63;
	int DELIMETER = 64;
	int MISC = 65;
	int IDENT = 66;
}
