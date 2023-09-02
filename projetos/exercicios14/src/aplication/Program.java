package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posmaior;
		double maior;
		
		System.out.println("Quantos numeros você vai digitar: ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		maior = vetor[0];
		posmaior = 0;
		
		for(int i=0;i <n; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posmaior = i;
			}
		}
		
		System.out.println("MAIOR VALOR: " + maior);
		System.out.println("Posição do maior valor: " + posmaior);
		

		sc.close();
	}

}
