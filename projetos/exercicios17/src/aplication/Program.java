package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Quantos elementos vai ter o vetor: ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		double mediaPares = 0;
		double pares=0;
		int cont =0 ;
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		for(int i =0; i<n; i++) {
			if(vetor[i] % 2 == 0) {
				pares = pares + vetor[i];
				cont ++ ;
			}
		}
		if(pares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			System.out.println("MÉDIA DOS PARES");
			mediaPares = pares/cont;
			System.out.println(mediaPares);
		}
		
		
		
		sc.close();
		
	}
}
