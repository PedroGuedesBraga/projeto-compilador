package compiladores.analisadorLexico;

%%

%{


private Token generateToken(String name, String value){
	Token generatedToken = new Token(name, value);
	System.out.println(generatedToken.toString());
	return generatedToken;
}

%}


%class LexicalAnalyzer
%type void



ID = [_|a-z|A-Z][a-z|A-Z|0-9|_]*
Digito = [0-9]
brancos = [\n| |\t]
Integer = Digito+
RealNumber = Integer.Integer

%%

"program"                       { generateToken("program", ""); }
"begin"                         { generateToken("begin",""); }
"end"                      	 { generateToken("end", ""); }
{ID}                         { generateToken("Id", "Endereco na tabela de simbolos (FAZER)");}
"+"                         { generateToken("+", ""); }
"-"                         { generateToken("-", ""); }
"*"							{ generateToken("*", ""); }
"/"							{ generateToken("/", ""); }
":="                        { generateToken(":=", ""); }
"," 						{ generateToken(",", ""); }
"."							{ generateToken(".", ""); }
";"							{ generateToken(";", ""); }
"("							{ generateToken("(", ""); }
")"							{ generateToken(")", ""); }
"["							{ generateToken("[", ""); }
"]"							{ generateToken("]", ""); }
"="							{ generateToken("=", ""); }
"{"							{ generateToken("{", ""); }
"}"							{ generateToken("}", ""); }
"`"							{ generateToken("`", ""); }
"and"                  		{generateToken("and","" );}
"array"                  	{generateToken("array","" );}
"begin"                  	{generateToken("begin","" );}
"case"                  	{generateToken("case","" );}
"const"                  	{generateToken("const","" );}
"div"                  		{generateToken("div","" );}
"do"                  		{generateToken("do","" );}
"downto"                  	{generateToken("downto","" );}
"else"                  	{generateToken("else","" );}
"end"                  		{generateToken("end","" );}
"file"                  	{generateToken("file","" );}
"for"                  		{generateToken("for","" );}
"function"                  {generateToken("function","" );}
"goto"                 		{generateToken("goto","" );}
"if"                  		{generateToken("if","" );}
"in"                  		{generateToken("in","" );}
"label"                  	{generateToken("label","" );}
"mod"                  		{generateToken("mod","" );}
"nil"                  		{generateToken("nil","" );}
"not"                  		{generateToken("not","" );}
"of"                  		{generateToken("of","" );}
"or"                  		{generateToken("or","" );}
"packed"                    {generateToken("packed","" );}
"procedure"                 {generateToken("procedure","" );}
"program"                   {generateToken("program","" );}
"record"                    {generateToken("record","" );}
"repeat"                    {generateToken("repeat","" );}
"set"                       {generateToken("set","" );}
"then"                  	{generateToken("then","" );}
"to"                  		{generateToken("to","" );}
"type"                  	{generateToken("type","" );}
"until"                     {generateToken("until","" );}
"var"                  		{generateToken("var","" );}
"while"                  	{generateToken("while","" );}
"with"                  	{generateToken("with","" );}
{Integer}                   {generateToken("Integer",yytext());}
{brancos}					{/* Nao faz nada */}

. { /* Nao faz nada por enquanto. O "." significa qualquer outra coisa */}