package exerciciosEstrutura;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int hora_inicial = entrada.nextInt();
		int hora_final = entrada.nextInt();
		
		int duracao;
		
		if(hora_inicial < hora_final) {
			duracao = hora_final - hora_inicial;
		}
		else {
			duracao = 24 - hora_inicial + hora_final;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS");
		
		entrada.close();
		

	}

}
