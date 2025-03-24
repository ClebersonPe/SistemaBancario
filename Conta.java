package SistemaBancario;

import javax.swing.JOptionPane;

public class Conta {
	double saldo; 

	
	/*public void entrada() throws EntradaZerada, EntradaNegativa {
		double valor  = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor a Depositar: ", "Deposito", JOptionPane.QUESTION_MESSAGE));
		
		if(valor == 0) throw new EntradaZerada();
		if(valor < 0) throw new EntradaNegativa();
		
		try {
			this.saldo = (this.saldo + valor);
		} catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Valor Inválido, não é possivel depositar um valor nulo!");
		}
	}*/
	
	public void depositar(double valor) throws EntradaZerada, EntradaNegativa {
		//valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor a Depositar: ", "Deposito", JOptionPane.QUESTION_MESSAGE));
		
		if(valor == 0) throw new EntradaZerada();
		if(valor < 0) throw new EntradaNegativa();

		try {
			this.saldo = (this.saldo + valor);
		} catch(NumberFormatException error) {
			JOptionPane.showMessageDialog(null, error, "Digite um valor válido", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void sacar (double valor) throws EntradaZerada, EntradaNegativa {
		
		if(valor == 0) throw new EntradaZerada();
		if(valor < 0) throw new EntradaNegativa();
		
		try {
			this.saldo = (this.saldo - valor);
			
		}catch(NumberFormatException error) {
			JOptionPane.showMessageDialog(null, error, "Digite um valor válido", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void atualizarSaldo() {
		
		if (this.saldo < 0) {
			this.saldo = this.saldo + (0.08 * this.saldo);
		}
	}
	
}

	