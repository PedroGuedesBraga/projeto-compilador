# Compilador (com escopo reduzido) para a linguagem Pascal para a disciplina de Compiladores - Ciência da Computação UFCG

## Instruções: 

### Para gerar a classe java que representa o analisador léxico: 

#### java -jar <caminho do .jar do jflex na sua máquina> language.lex

### Para gerar a classe java que representa o analisador sintático:

#### java -jar <Caminho do .jar do cup na sua máquina> -parser Parser -symbols sym Parser.cup

### (Obs: jars do jflex e do cup na pasta "jars")

### Para realizar o processo de análise sobre um programa escrito no arquivo "Sample.txt" basta executar a classe "Main.java".







