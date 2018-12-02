package compiladores.analisadorLexico;

import java.util.LinkedList;

public class Procedure {
	
	private String identificador;
	private LinkedList<String> argumentsType; //tipo dos argumentos, para fazer checagem na chamada
	
	public Procedure(String identificador, LinkedList<String> argumentsType) {
		this.identificador = identificador;
		this.argumentsType = argumentsType;
	}
	
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public LinkedList<String> getArgumentsType() {
		return argumentsType;
	}
	public void setArgumentsType(LinkedList<String> argumentsType) {
		this.argumentsType = argumentsType;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof Procedure) {
			Procedure p = (Procedure) obj;
			if(p.getIdentificador().equals(this.identificador) && p.getArgumentsType().equals(this.argumentsType)) {
				return true;
			}
		}
		return false;
	}
	
	
}
