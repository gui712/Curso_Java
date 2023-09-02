package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantas valores vai ter cada vetor?");
		n = sc.nextInt();
		
		double[] vetorA = new double[n];
		double[] vetorB = new double[n];
		double[] vetorC = new double[n];
		
		System.out.println("Digites os valores do Vetor A: ");
		for(int i=0; i<n; i++) {
			vetorA[i] = sc.nextDouble();
		}
		
		System.out.println("Digite os valores do Vetor B: ");
		for(int i =0;i<n; i++) {
			vetorB[i] = sc.nextDouble();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		
		for(int i=0; i<n;i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		
		

		sc.close();
	}

}
