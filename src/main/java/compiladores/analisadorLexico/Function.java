package compiladores.analisadorLexico;

import java.util.LinkedList;

public class Function {

	private String identificador;
	private String tipoDoRetorno; //Tipo de retorno, para fazer checagem em expressoes
	private LinkedList<String> argumentsType; //Tipos dos argumentos, para fazer checagem na chamada de funcoes
	
	public Function(String identificador, String tipoDoRetorno, LinkedList<String> argumentsType) {
		this.identificador = identificador;
		this.tipoDoRetorno = tipoDoRetorno;
		this.argumentsType = argumentsType;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getTipoDoRetorno() {
		return tipoDoRetorno;
	}
	public void setTipoDoRetorno(String tipoDoRetorno) {
		this.tipoDoRetorno = tipoDoRetorno;
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
		if (obj instanceof Function) {
			Function f = (Function) obj;
			if(f.getIdentificador().equals(this.getIdentificador()) && f.getArgumentsType().equals(this.getArgumentsType())){
				return true;
			}
		}
		return false;
	}
	
	
}
