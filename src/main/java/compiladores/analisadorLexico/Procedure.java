package compiladores.analisadorLexico;

import java.util.LinkedList;
import java.util.List;

public class Procedure {
	
	private String identificador;
	private List<Argument> arguments; //tipo dos argumentos, para fazer checagem na chamada
	
	public Procedure(String identificador, List<Argument> arguments) {
		this.identificador = identificador;
		this.arguments = arguments;
	}
	
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public List<Argument> getArgumentsType() {
		return arguments;
	}
	public void setArgumentsType(List<Argument> arguments) {
		this.arguments = arguments;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof Procedure) {
			Procedure p = (Procedure) obj;
			if(p.getIdentificador().equals(this.identificador) && p.getArgumentsType().equals(this.arguments)) {
				return true;
			}
		}
		return false;
	}
	
	
}
