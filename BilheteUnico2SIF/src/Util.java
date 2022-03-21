import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Util {

	// array para armazenar objetos do tipo Bilhete 
	BilheteUnico[] bd = new BilheteUnico[5];
	
	// variavel para controlar as posicoes do array
	int index = 0;

	public void menuPricipal() {
		String aux = "Escolha uma operação:\n1. Administrador\n2. Usuário\n3. Finalizar";
		int opcao;
		
		do {
			opcao = parseInt(showInputDialog(aux));
			if(opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Opcão Inválida");
			}else {
				if(opcao == 1) {
					menuAdminitrador();
				} else if(opcao == 2) {
					menuUsuario();
				}
			}
		} while(opcao != 3); 
		
	}
	
	public void menuAdminitrador() {
		String aux = "Escolha uma operação:\n";
		aux += "1. Cadastrar Bilhete\n";
		aux += "2. Consultar Bilhete\n";
		aux += "3. Sair";
		int opcao;
		
		do {
		    opcao = parseInt(showInputDialog(aux));
		    if(opcao <1 || opcao > 3) {
		    	showMessageDialog(null, "Opcão Inválida");
		    } else {
		    	
		    }
		} while(opcao != 3);
		
	}

	public void menuUsuario() {

		String aux = "Escolha uma operação:\n";
		aux += "1. Consultar Saldo\n";
		aux += "2. Carregar Bilhete\n";
	    aux += "3. Passar na Catraca\n";
	    aux += "4. Sair";
	    int opcao;
	    
	    do {
	    	opcao = parseInt(showInputDialog(aux));
	    	if(opcao < 1 || opcao > 4) {
	    		showMessageDialog(null, "Opção Inválida");
	    	} else {
	    		
	    	}
	    } while(opcao != 4);
	    
	}

	public void cadastrarBilhete() {
		if(index < bd.length) {
			String nome = showInputDialog("Nome: ");
			String cpf = showInputDialog("CPF: ");
			String tipo = showInputDialog("Tipo (Aluno/Professor/Normal): ");
			bd[index] = new BilheteUnico(nome, cpf, tipo);
			index++;
		} else {
			showMessageDialog(null,"Proure um posto autorizado");
		}
	}
}
	

