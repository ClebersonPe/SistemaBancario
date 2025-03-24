package SistemaBancario;

import javax.swing.JOptionPane;


public class MenuContas extends Menu{
	ContaCorrente contaCC = new ContaCorrente();
	ContaPoupanca contaCP = new ContaPoupanca();
	
	
	public void executar(){
		executarMenu();
		avaliarOpcaoEscolhida();
	}
	
	protected void executarMenu() {
		String opcoes []= { "Sair","Conta Corrente","Conta Poupan�a"};
	  this.opcao = JOptionPane.showOptionDialog(null, "Opera��o bancaria: ", "Banco", 0, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
		
	}
	
	protected void avaliarOpcaoEscolhida() {
		do {
		switch (this.opcao) {
		case 1:
			operarContaCC();
			break;
		case 2:
			operarContaCP();
			break;
		}
		executarMenu();
		} while (this.opcao != 0);
	}
	
	private void operarContaCC() {
		String opcoes[] = {"0 - Voltar", "1 - Consultar Saldo", "2 - Depositar", "3 - Sacar", "4 - Atualizar Saldo"};
		int submenu;
		do {
			 submenu = JOptionPane.showOptionDialog(null, "Escolha uma Fun��o", "Banco - Conta Corrente", 0, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
			//submenu = Integer.parseInt(JOptionPane.showInputDialog(null, opcoes));
			 switch (submenu) {
			 case 1:
				JOptionPane.showMessageDialog(null, contaCC.toString());
				 break;
				 
			 case 2:
				 try {
					 double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do dep�sito: ", "Banco", JOptionPane.QUESTION_MESSAGE));
					 contaCC.depositar(valor);
				 }catch(EntradaNegativa erro) {
					 JOptionPane.showMessageDialog(null, erro, "Valor Inv�lido", 0);
				 }catch(EntradaZerada erro) {
					 JOptionPane.showMessageDialog(null, erro, "Valor Inv�lido", 0);
				 }
				 break;
				
			 case 3:
				 try {
					 double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do saque: ", "Banco", JOptionPane.QUESTION_MESSAGE));
					 contaCC.sacar(valor);
				 }catch(EntradaNegativa erro) {
					 JOptionPane.showMessageDialog(null, erro, "Valor Inv�lido", 0);
				 }catch(EntradaZerada erro) {
					 JOptionPane.showMessageDialog(null, erro, "Valor Inv�lido", 0);
				 }
				 break;
				 
			 case 4:
				 if (contaCC.saldo < 0) {
					 contaCC.atualizarSaldo();
				 } else {
					 JOptionPane.showMessageDialog(null, "Saldo Positivo, Fun��o Inv�lida");
				 }
				
				}
			 
			 System.out.println("submenu = " + submenu);
		} while (submenu > 0);	
	}
	
	
	private void operarContaCP() {
		
		String opcoes[] = {"0 - Voltar", "1 - Consultar Saldo", "2 - Depositar", "3 - Sacar", "4 - Atualizar Saldo"};
		
		int submenu;
		do {
			 submenu = JOptionPane.showOptionDialog(null, "Escolha uma Fun��o", "Banco - Conta Poupan�a", 0, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
			//submenu = Integer.parseInt(JOptionPane.showInputDialog(null, opcoes));
			 switch (submenu) {
			 case 1:
				 JOptionPane.showMessageDialog(null, contaCP.toString());
				 break;
				 
			 case 2:
				 try {
					 double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do dep�sito: ", "Banco", JOptionPane.QUESTION_MESSAGE));
					 contaCP.depositar(valor);
				 }catch(EntradaNegativa erro) {
					 JOptionPane.showMessageDialog(null, erro, "Valor Inv�lido", 0);
				 }catch(EntradaZerada erro) {
					 JOptionPane.showMessageDialog(null, erro, "Valor Inv�lido", 0);
				 }
				 break;
				
			 case 3:
				 try {
					 double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do saque: ", "Banco", JOptionPane.QUESTION_MESSAGE));
					 contaCP.sacar(valor);
				 }catch(EntradaNegativa erro) {
					 JOptionPane.showMessageDialog(null, erro, "Valor Inv�lido", 0);
				 }catch(EntradaZerada erro) {
					 JOptionPane.showMessageDialog(null, erro, "Valor Inv�lido", 0);
				 }
				 break;
				 
			 case 4:
				 try {
				 double reajuste = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do reajuste", "Banco", JOptionPane.QUESTION_MESSAGE));
				 contaCP.atualizarSaldo(reajuste);
				 } catch(EntradaNegativa erro) {
					 JOptionPane.showMessageDialog(null, erro, "Valor Inv�lido", 0);
				 } catch(EntradaZerada erro) {
					 JOptionPane.showMessageDialog(null, erro, "Valor Inv�lido", 0);
				 }
				 break;
				 
			default:
				 JOptionPane.showMessageDialog(null,"Valor Inv�lido", "Aten��o", JOptionPane.INFORMATION_MESSAGE);
				 break;
					 
				}
		} while (submenu > 0);	
		
		
	}
	
	
}
