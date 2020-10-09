package controle;
import java.util.Scanner;
import dominio.massa;

public class controlaMassa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a massa inicial:");
		float massaInicial = leia.nextFloat();
		
		Massa massa = new Massa(massaInicial);
		massa.calculaTempo();
		
		System.out.println("Massa inicial: " + massa.getMassaInicial() + " gramas");
		System.out.println("Massa final: " + massa.getMassaFinal() + " gramas" );
		System.out.println("Tempo obtido: " + massa.getTempo() + " segundos" );
		
	}

}
