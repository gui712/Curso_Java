package exerciciosSequencia1;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numeroFunc, horasTrab;
		double valorHora;
		double salario;
		
		numeroFunc = entrada.nextInt();
		horasTrab = entrada.nextInt();
		valorHora = entrada.nextDouble();
		
		salario = horasTrab * valorHora;
		
		System.out.println("Number = " + numeroFunc);
		System.out.println("Salary = U$" + salario);
		
		entrada.close();
		
		

	}

}
