package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdPares;
		
		System.out.println("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i=0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Numeros pares");
		
		qtdPares = 0;
		
		for(int i=0; i<n; i++) {
			if(vetor[i] % 2 == 0  ) {
				System.out.printf("%d ", vetor[i]);
				qtdPares ++;
			}
		}
		
		System.out.printf("\n\nQuantidade de Pare = %d\n", qtdPares);

		
		sc.close();
	}

}
