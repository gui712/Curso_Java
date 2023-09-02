package primeiroPrograma;

import java.util.Scanner;

public class AulaEntradaDados2 {

	public static void main(String[] args) {
		// Para Ler um texto até a quebra de linha

		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;

		x = sc.nextInt(); // não tem quebra de linha
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados Digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
