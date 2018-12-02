


package compiladores.analisadorLexico;

import java.io.FileReader;
import java.nio.file.Paths;
public class Main {

	public static void main(String[] args) {
		String rootPath = Paths.get("").toAbsolutePath().toString();
        String subPath = "/src/main/java/compiladores/analisadorLexico/";
        
        String sourceCode = rootPath + subPath + "Sample.txt";
        
        try {
        	Parser p = new Parser(new LexicalAnalyzer(new FileReader(sourceCode)));
        	Object result = p.parse().value;
        	System.out.println("Compilacao concluida com sucesso...");
        }catch(Exception e){
        	e.printStackTrace();
        }
	}
	
}
