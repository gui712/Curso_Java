package exercicios6;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		double salario = funcionario.netSalary();
		System.out.println("Employee: " + funcionario.name +" , " + salario);
		System.out.println("Antes do toString");
		System.out.print("Emp " + funcionario);
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		double incremento = sc.nextDouble();
		funcionario.increaseSalary(incremento);
		
		System.out.println("Update data: " + funcionario);
		
		sc.close();
		

	}

}
