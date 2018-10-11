package compiladores.analisadorLexico;

import java.io.IOException;
import java.io.StringReader;

public class TesteLexico {

	public static void main(String[] args) throws IOException {

        String expr = "program ProgramaTest begin end.";

        LexicalAnalyzer lexical = new LexicalAnalyzer(new StringReader(expr));
        lexical.yylex();

    }
	
}
