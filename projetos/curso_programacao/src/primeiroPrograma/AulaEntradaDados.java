package primeiroPrograma;

import java.util.Locale;
import java.util.Scanner;

public class AulaEntradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char h;
		System.out.println("Digite uma palavra: ");
		x = sc.next();
		System.out.println("Você digitou: " + x);
		System.out.println("Agora digite um número inteiro: ");
		y = sc.nextInt();
		System.out.println("O número digitado foi: " + y);
		System.out.println("Digite outro número: ");
		z = sc.nextDouble();
		System.out.println("VocÊ digitou: " + z);
		System.out.println("Digite apenas uma letra: ");
		h = sc.next().charAt(0);
		System.out.println("A letra digitada foi: " + h);
		
		

		sc.close();
	}

}
