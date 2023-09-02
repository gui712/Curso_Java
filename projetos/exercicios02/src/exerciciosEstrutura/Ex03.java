package exerciciosEstrutura;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1 = entrada.nextInt();
		int numero2 = entrada.nextInt();
		
		if(numero1 % numero2 == 0 || numero2 % numero1 == 0 ) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		
		entrada.close();

	}

}
