import os
#Script para gerar as classes java que representam os analisadores
os.system("java -jar C:\Users\Matheus\Downloads\projeto-compilador-master\jars\jflex-1.6.1.jar language.lex")
os.system("java -jar C:\Users\Matheus\Downloads\projeto-compilador-master\jars\java-cup-11b.jar -parser Parser -symbols sym Parser.cup")