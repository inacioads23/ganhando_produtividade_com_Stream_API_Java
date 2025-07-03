package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Predicate<T>: Representa 'uma função' que aceita um 'argumento do tipo T' e 'retorna um valor booleano' (verdadeiro ou falso).
// É comumente usada para filtrar os elementos do Stream com base em alguma condição.

public class PredicateExample2 {
	
	public static void main(String[] args) {
		
		// Criar uma lista de números inteiros
		List<Integer> numeros  = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Usar o Predicate com expressão lambda para filtrar números pares
		Predicate<Integer> isPar = numero -> numero % 2 == 0;
		
		// Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
		List<Integer> numerosPares = numeros.stream().filter(isPar).collect(Collectors.toList()); // opção1		
		List<Integer> numerosPares1 = numeros.stream().filter(isPar).toList(); // opção2
		
		// Imprimir a lista de números pares
		System.out.println("Opção1 - Usando Method Reference");
		numerosPares.forEach(System.out::println);
		
		System.out.println("\nOpção2 - Usando Lambda");
		numerosPares1.forEach(p -> System.out.println(p));
		
	}

}
