package compiladores.analisadorLexico;

import java_cup.runtime.*;


%%

%cup
%line
%column

%class LexicalAnalyzer


%{

StringBuffer string = new StringBuffer();

private Symbol symbol(int type) {
	return new Symbol(type, yyline, yycolumn);
	}
	
private Symbol symbol(int type, Object value) {
	return new Symbol(type, yyline, yycolumn, value);
	}

%}

%caseless
%unicode




ID = [_|a-z|A-Z][a-z|A-Z|0-9|_]*
Digito = [0-9]
LineTerminator = \r|\n|\r\n
brancos = {LineTerminator} | [ \t\f]
Integer = [0-9]+
String_Literal = '.*'

%%


"program"                       { return symbol(sym.PROGRAM); }
"begin"                         { return symbol(sym.BEGIN); }
"end"                      	 { return symbol(sym.END); }
"+"                         { return symbol(sym.PLUS); }
"-"                         { return symbol(sym.MINUS); }
"*"							{ return symbol(sym.MULT); }
"/"							{ return symbol(sym.DIV); }
":="                        { return symbol(sym.ASSIGNMENT); }
"="                         { return symbol(sym.EQ); }
";"							{ return symbol(sym.SEMICOLON); }
"," 						{ return symbol(sym.COMMA); }
"."							{ return symbol(sym.DOT); }
":"                         { return symbol(sym.COLON); }
"("							{ return symbol(sym.OPEN_PARENTHESES); }
")"							{ return symbol(sym.CLOSE_PARENTHESES); }
"["							{ return symbol(sym.OPEN_BRACKETS); }
"]"							{ return symbol(sym.CLOSE_BRACKETS); }
"{"							{ return symbol(sym.OPEN_CURLY_BRACKETS); }
"}"							{ return symbol(sym.CLOSE_CURLY_BRACKETS); }
"`"							{ return symbol(sym.CRASIS); }
"and"                  		{ return symbol(sym.AND); }
"array"                  	{ return symbol(sym.ARRAY); }
"case"                  	{ return symbol(sym.CASE); }
"const"                  	{ return symbol(sym.CONST); }
"div"                  		{ return symbol(sym.INTEGER_DIV); }
"do"                  		{ return symbol(sym.DO); }
"downto"                  	{ return symbol(sym.DOWNTO); }
"else"                  	{ return symbol(sym.ELSE); }
"file"                  	{ return symbol(sym.FILE); }
"for"                  		{ return symbol(sym.FOR); }
"function"                  { return symbol(sym.FUNCTION); }
"goto"                 		{ return symbol(sym.GOTO); }
"if"                  		{ return symbol(sym.IF); }
"in"                  		{ return symbol(sym.IN); }
"label"                  	{ return symbol(sym.LABEL); }
"mod"                  		{ return symbol(sym.MOD); }
"nil"                  		{ return symbol(sym.NIL); }
"not"                  		{ return symbol(sym.NOT); }
"of"                  		{ return symbol(sym.OF); }
"or"                  		{ return symbol(sym.OR); }
"packed"                    { return symbol(sym.PACKED); }
"procedure"                 { return symbol(sym.PROCEDURE); }
"record"                    { return symbol(sym.RECORD); }
"repeat"                    { return symbol(sym.REPEAT); }
"set"                       { return symbol(sym.SET); }
"then"                  	{ return symbol(sym.THEN); }
"to"                  		{ return symbol(sym.TO); }
"type"                  	{ return symbol(sym.TYPE); }
"until"                     { return symbol(sym.UNTIL); }
"var"                  		{ return symbol(sym.VAR); }
"while"                  	{ return symbol(sym.WHILE); }
"with"                  	{ return symbol(sym.WITH); }
{Integer}                   { return symbol(sym.INTEGER, yytext()); }
">="                        { return symbol(sym.GE); }
"<="                        { return symbol(sym.LE); }
">"                         { return symbol(sym.GT); }
"<"                         { return symbol(sym.LT); }
"true"						{ return symbol(sym.TRUE, yytext());}
"false"						{ return symbol(sym.FALSE, yytext());}
"boolean"                   { return symbol(sym.BOOLEAN, yytext());}
"integer"                   { return symbol(sym.TYPE_INTEGER, yytext());}
"string"                    { return symbol(sym.STRING, yytext()); }
"real"                      { return symbol(sym.REAL); }
{brancos}					{/* Nao faz nada */}
{ID}                        { return symbol(sym.IDENTIFIER, yytext()); }
{String_Literal}			{ return symbol(sym.STRING_LITERAL, yytext()); }
<<EOF>> 					{ return symbol(sym.EOF); }
"<>"						{ return symbol(sym.UQ); }
"><"						{ return symbol(sym.SYMDIFF); }
"include"					{ return symbol(sym.INCLUDE); }
"exclude"					{ return symbol(sym.EXCLUDE); }

. { /* Nao faz nada por enquanto. O "." significa qualquer outra coisa */}