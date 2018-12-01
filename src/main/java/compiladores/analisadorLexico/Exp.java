package compiladores.analisadorLexico;

public class Exp {	  
	
    public String type;
    public String code;
	public Boolean isSet;   
	

    public Exp(String t, String code) {
	  this.type = t;
	  this.code = code;
	  this.isSet = false;
    }
	
	public Exp(String t, String code,Boolean isSet) {
	  this.type = t;
	  this.code = code;
	  this.isSet = isSet;
    }

}
