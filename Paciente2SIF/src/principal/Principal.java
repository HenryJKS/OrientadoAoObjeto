package principal;
import paciente.Paciente;

public class Principal {
	public static void main(String[] args) {

	Paciente p = new Paciente();
	
    p.setNome("Henry");
    System.out.println(p.getNome());

    }
}