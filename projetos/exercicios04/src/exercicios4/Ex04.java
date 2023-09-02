package exercicios4;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		for(int i=0; i<n; i++) {
			
			int x = entrada.nextInt();
			int y = entrada.nextInt();
			
			if(y==0) {
				System.out.println("Divisão Impossivel");
			}
			else {
				double div = (double) x/y;
				System.out.println(div);
			}
		}
		
		entrada.close();

	}

}
