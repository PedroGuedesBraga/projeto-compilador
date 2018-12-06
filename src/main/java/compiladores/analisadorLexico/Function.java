package compiladores.analisadorLexico;

import java.util.LinkedList;
import java.util.List;

public class Function {

	private String identificador;
	private String tipoDoRetorno; //Tipo de retorno, para fazer checagem em expressoes
	private List<Argument> arguments;

	
	public List<Argument> getArguments() {
		return arguments;
	}

	public void setArguments(List<Argument> arguments) {
		this.arguments = arguments;
	}

	public Function(String identificador, String tipoDoRetorno, List<Argument> arguments) {
		this.identificador = identificador;
		this.tipoDoRetorno = tipoDoRetorno;
		this.arguments = arguments;
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

	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if (obj instanceof Function) {
			Function f = (Function) obj;
			if(f.getIdentificador().equals(this.getIdentificador())){
				if(!(f.getArguments().size() == this.getArguments().size())) {
					return false;
				}
				for(int i = 0; i < f.getArguments().size(); i++) {
					if(!f.getArguments().get(i).equalsTypeArgument(this.getArguments().get(i))) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
	
	
}
