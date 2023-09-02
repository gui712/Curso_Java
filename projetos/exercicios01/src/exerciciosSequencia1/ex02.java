package exerciciosSequencia1;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		double area,raio;
		double pi = 3.14159;
		
		raio = entrada.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.println(" A = " + area);
		
		entrada.close();

	}

}
