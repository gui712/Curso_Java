package exercicios3;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else {
				System.out.println("Quarto");
			}
			
			x = entrada.nextInt();
			y = entrada.nextInt();
		}
		
		entrada.close();

	}

}
