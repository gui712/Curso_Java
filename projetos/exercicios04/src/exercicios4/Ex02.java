package exercicios4;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < n ; i++) {
			int x = entrada.nextInt();
			
			if(x >= 10 && x <= 20) {
				in = in + 1; 
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");

		entrada.close();
	}

}
