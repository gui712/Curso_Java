package aplication;

public class Program {

	public static void main(String[] args) {
		// Sintaxe opcional e simplificada para percorrer coleções
		
		String[] vect = new  String[] {"Maria", "Bob", "Alex"};
		
		//for usado normalmente
		for(int i=0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-----------------------");
		
		for(String nomes : vect) {
			System.out.println(nomes);
		}

	}

}
