package exerciciosSequencia1;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int cod_peca1,num_pecas1, cod_peca2, num_pecas2;
		double valor_peca1, valor_peca2, valor_pago;
		
		cod_peca1 = entrada.nextInt();
		num_pecas1 = entrada.nextInt();
		valor_peca1 = entrada.nextDouble();
		cod_peca2 = entrada.nextInt();
		num_pecas2 = entrada.nextInt();
		valor_peca2 = entrada.nextDouble();
		
		valor_pago = (num_pecas1 * valor_peca1) + (num_pecas2 * valor_peca2); 
		
		System.out.println("VALOR A PAGAR: " + valor_pago);
		
		entrada.close();
	}

}
