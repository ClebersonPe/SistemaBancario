package SistemaBancario;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuContas menu = new MenuContas();
		
		try {
			menu.executar();
		}catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		
		

	}

}

