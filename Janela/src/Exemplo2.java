import javax.swing.JOptionPane;

public class Exemplo2 {

	public static void main(String[] args) {
	
		int botao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja finalizar?");
		if(botao == 0) {
			JOptionPane.showMessageDialog(null, "Obrigado por usar. ");
		} else {
			JOptionPane.showMessageDialog(null, "Permaceremos no sistema. ");
		}
		
	}

}
