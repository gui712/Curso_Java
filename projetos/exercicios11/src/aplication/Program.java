package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros você vai digitar");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i =0; i<vetor.length; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		double media = 0.0;
		
		System.out.println("VALORES: ");
		
		for(int i=0; i<vetor.length; i++) {
			soma = soma + vetor[i];
			System.out.printf("%.1f ", vetor[i]);
		}
		
		media = soma /n;
		System.out.printf("\nSoma = %.2f\n", soma);
		System.out.printf("Media = %.2f\n", media);
		
		sc.close();
		
		

	}

}
