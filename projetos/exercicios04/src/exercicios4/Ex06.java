package exercicios4;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}

		entrada.close();
	}

}
