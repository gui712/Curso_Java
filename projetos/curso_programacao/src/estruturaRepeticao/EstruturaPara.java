package estruturaRepeticao;

import java.util.Scanner;

public class EstruturaPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for(int i=0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
			
		}
		
		System.out.println("A soma dos valores é = " + soma);
		
		for(int i = 0; i<5; i++ ) {
			System.out.println("vALOR de i: " + i);
		}

		
		sc.close();
	}

}
