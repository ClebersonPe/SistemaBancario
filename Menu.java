package SistemaBancario;

import javax.swing.JOptionPane;

public abstract class Menu {
	int opcao;
	String mensagemMenu;
	
	public abstract void executar();
	
	
	
	protected abstract void executarMenu();
		
	
		
	
	protected abstract void avaliarOpcaoEscolhida();
		
	
	
	
}
