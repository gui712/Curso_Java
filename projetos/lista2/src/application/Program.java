package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Guilherme");
		list.add("Alex");
		list.add("Jessica");
		list.add("Carol");
		list.add(2, "Marcão");
		list.add("Ana");
		list.add("Anna");
		
		System.out.println(list.size());
				
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--/-----/-------/");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println(list.size());
		
		System.out.println("----------------------");
		System.out.println("Index of Jeh: " + list.indexOf("Jessica"));
		System.out.println("Index of Marcao: " + list.indexOf("Marcão"));//sempre que não encontra ele retorna -1
		System.out.println("----------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x: result) {
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElseGet(null);
		
		System.out.println(name);
		
		
	}

}
