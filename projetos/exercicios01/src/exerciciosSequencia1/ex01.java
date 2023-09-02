package exerciciosSequencia1;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int x,y, soma;
		
		x = entrada.nextInt();
		y = entrada.nextInt();
		
		soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		
		entrada.close();
		
		

	}

}
