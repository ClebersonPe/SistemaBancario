package SistemaBancario;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {
	private double limiteEspecial;
	
	
	public void sacar (double valor) throws EntradaNegativa, EntradaZerada {
		
		if(valor == 0) throw new EntradaZerada();
		if(valor > 0) throw new EntradaNegativa();
		
		try{
			this.saldo =(this.saldo - valor);
			
		
		}catch(NumberFormatException error) {
			JOptionPane.showMessageDialog(null, error, "Digite um valor válido", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public String toString() {
		return "Saldo da Conta: " + this.saldo + "\n" + "Limite Especial: " + limiteEspecial;
		
	}
	
	public ContaCorrente() {   //construtor
		this.saldo = 500;
		limiteEspecial = 1000;
	}


	
}
