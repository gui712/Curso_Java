package exerciciosSequencia1;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();

		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.println("TRINAGULO: " + triangulo);
		System.out.println("CIRCULO: " + circulo);
		System.out.println("TRAPEZIO: " + trapezio);
		System.out.println("QUADRADO: " + quadrado);
		System.out.println("RETANGULO: " + retangulo);
		
		entrada.close();

	}

}
