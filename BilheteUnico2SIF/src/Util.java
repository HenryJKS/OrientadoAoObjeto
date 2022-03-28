import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class Util {

	// array para armazenar objetos do tipo Bilhete 
	private BilheteUnico[] bd = new BilheteUnico[5];
	
	// variavel para controlar as posicoes do array
	private int index = 0;

	public void menuPricipal() {
		String aux = "Escolha uma opera��o:\n1. Administrador\n2. Usu�rio\n3. Finalizar";
		int opcao;
		
		do {
			opcao = parseInt(showInputDialog(aux));
			if(opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Opc�o Inv�lida");
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
		String aux = "Escolha uma opera��o:\n";
		aux += "1. Cadastrar Bilhete\n";
		aux += "2. Consultar Bilhete\n";
		aux += "3. Sair";
		int opcao;
		
		do {
		    opcao = parseInt(showInputDialog(aux));
		    if(opcao <1 || opcao > 3) {
		    	showMessageDialog(null, "Opc�o Inv�lida");
		    } else if(opcao == 1) {
		    	cadastrarBilhete();
		    	
		    } else if(opcao == 2) {
		    	consultarBilhete();
		    }
		} while(opcao != 3);
		
	}

	public void menuUsuario() {

		String aux = "Escolha uma opera��o:\n";
		aux += "1. Consultar Saldo\n";
		aux += "2. Carregar Bilhete\n";
	    aux += "3. Passar na Catraca\n";
	    aux += "4. Sair";
	    int opcao;
	    
	    do {
	    	opcao = parseInt(showInputDialog(aux));
	    	if(opcao < 1 || opcao > 4) {
	    		showMessageDialog(null, "Op��o Inv�lida");
	    	} else if(opcao == 1) {
	    		consultarSaldo(); 		
	    	} else if(opcao == 2) {
	    		carregarBilhete();
	    	} else if(opcao == 3) {
	    		passarCatraca();
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
	
	//M�todo auxiliar para pesquisar m bilhete pelo cpf do usuario
	//M�todo retorna a posicao valida do array ou -1 se nao encontrar o o objeto
	
	public int pesquisar(String cpf) {
		int aux = -1;
		for(int i = 0; i < index; i++) {
			if(bd[i].usuario.cpf.equals(cpf)){
			aux = i;
		    break;
		}
			
		}
		return aux;
	}

	//M�todo para consultar e exibir os dados do bilhete
	
	public void consultarBilhete() {
		int posicao;
		String aux;
		String cpf;
		
		cpf = showInputDialog("Informe o CPF para a pesquisa: ");
		posicao = pesquisar(cpf);
		if(posicao == -1) {
			showMessageDialog(null, cpf + " N�o encontrado");
		} else {
			aux = "N�mero do bilhete: " + bd[posicao].numero + "\n";
			aux += "Nome do usu�rio: " + bd[posicao].usuario.nome + "\n";
			aux += "CPF do usu�rio: " + bd[posicao].usuario.cpf + "\n";
			aux += "Saldo do usu�rio: R$ " + String.format("%.2f", bd[posicao].saldo) + "\n";
			aux += "Tipo de bilhete: " + bd[posicao].usuario.tipo + "\n";
			showMessageDialog(null, aux);
		}
				
	}
	
	//M�todo para consultar saldo
	
	public void consultarSaldo() {
		String cpf;
		int posicao;
		
		cpf = showInputDialog("CPF");
        posicao = pesquisar(cpf);
		if(posicao == -1) {
			showMessageDialog(null, cpf + " CPF n�o encontrado");
		} else {
			showMessageDialog(null, "Saldo R$ " + String.format("%.2f", bd[posicao].consultarSaldo()));
		}
		}

	//M�todo para carregar o bilhete com um valor informado pelo usuario
	
   public void carregarBilhete() {
	   String cpf;
	   int posicao;
	   double valor;
	   
	   cpf = showInputDialog("CPF");
	   posicao = pesquisar(cpf);
	   if(posicao == -1) {
		   showMessageDialog(null, cpf + " CPF n�o encontrado");
	   } else {
		  valor = parseDouble(showInputDialog("Informe o valor da recarga: "));
		  bd[posicao].carregar(valor);
	   }
	   
	   
   }
   
   //M�todo para passar na catraca
   
   public void passarCatraca() {
	   String cpf;
	   int posicao;
	   double valor;
	   
	   cpf = showInputDialog("CPF");
	   posicao = pesquisar(cpf);
	   if(posicao == -1) {
		   showMessageDialog(null, cpf + " CPF n�o encontrado");
   } else {
	   bd[posicao].passarNaCatraca();
   }
	
	
}
   
}
	

	
	
	


	

