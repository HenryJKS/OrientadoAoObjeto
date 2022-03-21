import java.util.Random;

public class BilheteUnico {

	//Atributos ou propriedades
	int numero;
	double saldo;
	static double valorDaPassagem = 4.40;
	Usuario usuario;
	
	public BilheteUnico(String nome, String cpf, String tipo) {
		Random gerador = new Random();
		this.numero = gerador.nextInt(10000); //gera um numero abaixo de 10000
		this.saldo = 0;
		this.usuario = new Usuario(nome, cpf, tipo);
	}
		
	//Metodo para retornar valor do saldo
	public double consultarSaldo() {
		return this.saldo;
	}
	
	
	//Metodo para debitar valor do saldo do bilhete
	public void passarNaCatraca() {
		if(saldo >= valorDaPassagem) {
		    if(usuario.tipo.equalsIgnoreCase("Estudante") || usuario.tipo.equalsIgnoreCase("Professor"));
		    saldo -= valorDaPassagem /2;
		} else {
			saldo -= valorDaPassagem;
		}
	}
	
	//Metodo para carregar o bilhete
	public void carregar(double valor) {
		this.saldo += valor;
		
	}
	
	
	
	
}