package estruturaRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class AulaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		char resp;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
		
			double C = entrada.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
			System.out.println("Deseja Repetir? (s/n)");
			resp = entrada.next().charAt(0);
		} while(resp != 'n');
		
		entrada.close();

	}

}
