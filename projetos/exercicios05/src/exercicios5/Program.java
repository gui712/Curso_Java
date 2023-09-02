package exercicios5;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x;
		
		x = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		double area = x.area();
		double perimetro = x.perimetro();
		double diagonal = x.diagonal();
		
		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + perimetro);
		System.out.println("Diagonal = " + diagonal);
		
		sc.close();

	}

}
