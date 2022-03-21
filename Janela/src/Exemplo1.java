import javax.swing.JOptionPane;

public class Exemplo1 {

	public static void main(String[] args) {
		
		//JOptionPane.showMessageDialog(null, "Teste");
		//JOptionPane.showMessageDialog(null, "Teste2", "Janela", 2);
		
		//String nome = JOptionPane.showInputDialog("Teste ?");
		//JOptionPane.showMessageDialog(null, nome);
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		int total = valor1 + valor2;
		JOptionPane.showMessageDialog(null, "total = " + total);

		
		
	}

}
