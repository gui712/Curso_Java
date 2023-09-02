package exercicios4;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int X = entrada.nextInt();
		
		for(int i = 1; i <= X; i = i + 2) {
			System.out.println(i);
		}
		

		entrada.close();
	}

}
