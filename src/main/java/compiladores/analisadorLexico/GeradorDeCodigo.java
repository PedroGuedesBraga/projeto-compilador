package compiladores.analisadorLexico;

import java.util.ArrayList;
import java.util.Hashtable;

public class GeradorDeCodigo {
	
	// array de registradores 
    ArrayList<Registrador>regs;
	int regnum ;
	int pc;
	Hashtable<String, Registrador> vars;
	ArrayList<String> instuctions ;
	
	
	
	public GeradorDeCodigo() {
		regnum = 0;
		vars = new Hashtable<String, Registrador>();
		regs = new ArrayList<Registrador>();
		pc = 0;
		instuctions = new ArrayList<String>();
		
		
	}
	
	
	// coloca uma variavel em um registrador
	public void saveVar(String id) {
		      
				Registrador reg =  new Registrador(id, regnum);
                 vars.put(id, reg);
                 instuctions.add("LD , R"+regnum +" , " + id);
                 System.out.println(instuctions.get(pc));
                 regnum += 1;
                 pc += 1;
		
	}
	
	// realiza operações
	public void op (String op,String e1,String e2) {
		int r1 = vars.get(e1).numero;		 // numero do registrador que contem o valor de e1
		int r2 =  vars.get(e2).numero;      // numero do registrador que contem valor de e2
		String operacao = selectOperator(op);
		if(operacao != null) {
			
			instuctions.add(operacao + "," + "R"+regnum + " , " + "R" +vars.get(e1).numero+
			" , R"+vars.get(e2).numero);
			System.out.println(instuctions.get(pc));
			Registrador r =  new Registrador(e1+op+e2, regnum);
			vars.put(e1+op+e2, r);
			pc += 1;
			regnum += 1;
			
		}
		
	}
	
	
	public String selectOperator(String op) {
		if(op.equals("+")) {return "Add";}
		if(op.equals("-")) {return "Sub";}
		if(op.equals("*")) {return "Mult";}
		if(op.equals("/")) {return "Div";}
		return null;
	}
	
	
	
	
	
	
	
	
	
	

}
