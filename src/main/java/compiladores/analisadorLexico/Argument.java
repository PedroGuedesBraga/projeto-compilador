package compiladores.analisadorLexico;

import java.util.List;

//Representa um argumento de uma funcao ou procedure
public class Argument {

	
	
	private String argumentIdentifier;
	private String argumentType;
	private boolean isSet;
	
	public Argument(String identifier, String argumentType, boolean isSet) {
		this.argumentIdentifier = identifier;
		this.argumentType = argumentType;
		this.isSet = isSet;
	}
	
	public boolean isSet() {
		return isSet;
	}
	public void setSet(boolean isSet) {
		this.isSet = isSet;
	}
	public String getArgumentIdentifier() {
		return argumentIdentifier;
	}
	public void setArgumentIdentifier(String argumentIdentifier) {
		this.argumentIdentifier = argumentIdentifier;
	}

	
	public String getArgumentType() {
		return argumentType;
	}
	public void setArgumentType(String argumentType) {
		this.argumentType = argumentType;
	}
	public boolean equalsTypeArgument(Object obj) {
		if(obj instanceof Argument) {
			Argument arg = (Argument) obj;
			if(arg.getArgumentType().equalsIgnoreCase(this.getArgumentType())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Argument) {
			Argument arg = (Argument) obj;
			if(arg.getArgumentIdentifier().equalsIgnoreCase(this.getArgumentIdentifier())) {
				return true;
			}
		}
		return false;
	}
}
