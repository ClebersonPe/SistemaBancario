package SistemaBancario;

public class EntradaNegativa extends Exception {
	
	public String toString(){
		
		return "O valor inserido não pode ser negativo";
	}
	
}
