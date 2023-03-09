package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("John");
		list.add(2, "Marco");

		
		for(String x : list) {
			System.out.println(x);
		}
		
		list.remove("Maria"); //remover por valor
		list.remove(0); // remover por posição
		list.removeIf(x -> x.charAt(0) == 'M'); // remover por predicado
		list.add("Bob");
		list.add("Jerson");
		System.out.println("-----------------");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		// Filtrar por letra J, transforma em stream para poder usar métodos e depois retorna ele para lista com collectors
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		System.out.println(result);
		
		System.out.println("-----------------");
		
		System.out.println("Index do Bob:" + list.indexOf("Bob"));
		System.out.println("Tamanho da lista: " + list.size());
		
		System.out.println("-----------------");
		
		//Encontrar por predicado
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("-----------------");
		
		
	}
}
