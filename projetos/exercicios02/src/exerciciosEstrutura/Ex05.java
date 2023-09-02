package exerciciosEstrutura;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int codItem = entrada.nextInt();
		int quantItem = entrada.nextInt();
		
		double total = 0.0;
		
		if(codItem == 1) {
			total = quantItem * 4.0;
		}
		else if(codItem == 2) {
			total = quantItem * 4.50;
		}
		else if(codItem == 3) {
			total = quantItem * 5.0;
		}
		else if(codItem == 4) {
			total = quantItem * 2;
		}
		else if(codItem == 5) {
			total = quantItem * 1.50;
		}
		else {
			System.out.println("Opção invalida");
		}
		
		System.out.println("Total: R$ " + total);
		
		entrada.close();
		
	}

}
