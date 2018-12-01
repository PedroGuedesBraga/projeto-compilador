package compiladores.analisadorLexico;

import java.util.ArrayList;
import java.util.Hashtable;

public class GeradorDeCodigo {
	
	// array de registradores 
    ArrayList<Registrador>regs;
	int regnum ;
	Hashtable<String, Registrador> vars;
	ArrayList<String> instuctions ;
	
	public GeradorDeCodigo() {
		regnum = 0;
		vars = new Hashtable<String, Registrador>();
		regs = new ArrayList<Registrador>();
		instuctions = new ArrayList<String>();
		
	}
	
	
	// coloca uma variavel em um registrador
	public void saveVar(String id) {
		        
				Registrador reg =  new Registrador(id, regnum);
                 vars.put(id, reg);
                 instuctions.add("LD, R"+regnum +" " + id);
                 System.out.println(instuctions.get(regnum));
                 regnum += 1;
		
	}
	
	
	
	
	

}
