package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos alunos ser]ao digitados: ");
		n = sc.nextInt();

		String[] nomes = new String[n];
		double[] notas1 = new double[n];
		double[] notas2 = new double[n];
		
		for(int i =0; i<n;i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			sc.nextLine();
			nomes[i] = sc.nextLine();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
		}
		double media = 0;
		System.out.println("Alunos apovados");
		
		for(int i =0; i < n; i++) {
			media =(notas1[i] + notas2[i])/2;
			if( media >= 6) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}

}
