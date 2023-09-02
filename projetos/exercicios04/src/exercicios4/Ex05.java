package exercicios4;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		int fat = 1;
		
		for(int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		entrada.close();

	}

}
