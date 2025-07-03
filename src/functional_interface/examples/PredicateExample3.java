package functional_interface.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Predicate<T>: Representa 'uma função' que aceita um 'argumento do tipo T' e 'retorna um valor booleano' (verdadeiro ou falso).
// É comumente usada para filtrar os elementos do Stream com base em alguma condição.

public class PredicateExample3 {
	
	public static void main(String[] args) {
		
		// Criar uma lista de números inteiros
		List<Integer> numeros  = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Usar o Predicate com uma classe anônima para filtrar números pares
		Predicate<Integer> isPar = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer n) {
				return n % 2 == 0;
			}
		};
		
		// Usar o predicado para 'filtrar' números pares e 'armazená-los' em outra lista
		List<Integer> numerosPares = new ArrayList<>();
		for(Integer n : numeros) {
			if(isPar.test(n)) {
				numerosPares.add(n);
			}
		}
		
		// Imprimir a lista de números pares
		for (Integer numeroPar : numerosPares) {
			System.out.println(numeroPar);
		}
		
	}

}
