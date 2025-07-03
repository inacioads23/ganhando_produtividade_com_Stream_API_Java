package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Predicate<T>: Representa 'uma função' que aceita um 'argumento do tipo T' e 'retorna um valor booleano' (verdadeiro ou falso).
// É comumente usada para 'filtrar' os elementos do Stream 'com base em alguma condição'.

public class PredicateExample1 {
	
	public static void main(String[] args) {
		
		// Criar uma lista de palavras
		List<String> palavras  = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");
		
		// Usar o Predicate com expressão lambda para verificar se a palavra tem mais de 5 caracteres
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
		
		// Usar o Stream para filtrar as palavras com mais de cinco caracteres, e em seguida
		// imprimir as palavras pós filtro
		
		System.out.println("Opção1 - Usando Method Reference");
		palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
		
		System.out.println("\nOpção2 - Usando Lambda");
		palavras.stream().filter(maisDeCincoCaracteres).forEach(p -> System.out.println(p));
		
		
	}

}
