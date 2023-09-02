package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma = 0,media = 0;
		
		System.out.println("Quantos elementos vai ter o vetor: ");
		n = sc.nextInt();

		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextDouble();
			soma = soma + vetor[i];
		}
		
		media = soma/n;
		
		System.out.println(media);
		
		System.out.println("Elementos abaixo da média: ");
		
		for(int i =0; i <n; i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		
		sc.close();
	}

}
