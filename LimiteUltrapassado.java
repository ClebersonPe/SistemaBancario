package SistemaBancario;

public class LimiteUltrapassado extends Exception {
	
	public String toString() {
		return "Limite ultrapassado, contate sua agência.";
	}
	
}
