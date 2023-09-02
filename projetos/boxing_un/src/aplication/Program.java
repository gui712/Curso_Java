package aplication;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 20;
		
		//Boxing é o processo de conversão de um obj tipo valor para um tipo referencia
		Object obj = x;
		
		System.out.println(obj);
		
		// unboxing converte um tipo referencia em um tipo valor compatível
		int y = (int) obj;
		
		System.out.println(y);

	}

}
