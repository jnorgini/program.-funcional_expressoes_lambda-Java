package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Aula5_versao1 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Implementação da interface com a nova classe UpperCaseName
		
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

		names.forEach(System.out::println);

	}

}
