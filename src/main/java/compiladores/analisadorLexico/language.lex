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
{ID}                         { generateToken("Id", "Endereco na tabela de simbolos (FAZER)"); }
"+"                         { generateToken("+", ""); }
"-"                         { generateToken("-", ""); }
{Integer}                     { generateToken("Integer",yytext()); }
{brancos}					{/* Nao faz nada */}

. { /* Nao faz nada por enquanto. O "." significa qualquer outra coisa */}