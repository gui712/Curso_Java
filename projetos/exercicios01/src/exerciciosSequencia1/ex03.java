package exerciciosSequencia1;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d,diferenca;
		
		Scanner entrada = new Scanner(System.in);
		
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("DIFERENÇA = " + diferenca);
		
		entrada.close();

	}

}
