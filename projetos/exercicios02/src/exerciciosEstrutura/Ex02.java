package exerciciosEstrutura;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int numero = entrada.nextInt();

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		entrada.close();

	}

}
