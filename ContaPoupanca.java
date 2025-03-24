package SistemaBancario;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {
	private double reajusteMensal;
	
	
	
	public void atualizarSaldo(double reajuste) throws EntradaNegativa, EntradaZerada {
		
		if(reajuste == 0) throw new EntradaZerada();
		if(reajuste < 0) throw new EntradaNegativa();
		
		try {
			reajusteMensal = (reajuste);
			this.saldo = this.saldo + (this.saldo *(reajuste/100));
			
		} catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, erro, "Digite um valor válido", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public String toString(){
		return "Saldo: " + this.saldo + "\n" + "Reajuste Mensal: " + reajusteMensal + "%";
	}
	
	public ContaPoupanca () {
		this.saldo = 5000;
		reajusteMensal = 1;
	}
}
