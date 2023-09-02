package exerciciosEstrutura;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int numero = entrada.nextInt();

		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}

		entrada.close();

	}

}
