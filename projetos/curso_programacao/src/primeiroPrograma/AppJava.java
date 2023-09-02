package primeiroPrograma;

import java.util.Locale;

public class AppJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = 42;
		double x = 10.357894;
		String nome = "Maria";
		int idade = 28;
		double renda = 4000.50;
		
		Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade,renda);
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println(y);
		System.out.println("Olá mundo!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		
		// printf é um tipo de formatação de string primeiro vem o texto e depois os argumentos
		// marcadores de variaveis %f = do tipo ponto flutuante %d = inteiro %s = texto %n = quebra de linha

	}

}
