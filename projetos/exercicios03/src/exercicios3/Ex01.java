package exercicios3;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bem Vindo ao Super leitor de Senhas");
		
		Scanner entrada = new Scanner(System.in);
		
		int senhaCorreta = 2002;
		
		int senhaDigitada = entrada.nextInt();
		
		while(senhaDigitada != senhaCorreta) {
			System.out.println("Senha Invalida");
			senhaDigitada = entrada.nextInt();
			
		}
		System.out.println("Senha Correta");
		System.out.println("Acesso Permitido:");
		
		entrada.close();

	}

}
