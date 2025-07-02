package functional_interface.examples;

// Supplier<T>: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
// É comumente usada para criar ou fornecer novos objetos de um determinado tipo.

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample1 {
	
	public static void main(String[] args) {
		// Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
		Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
		
		// Usar o Supplier para obter uma lista com 5 saudações		
		List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).collect(Collectors.toList());
		List<String> listaSaudacoes1 = Stream.generate(saudacao).limit(5).toList();
	
		
		// Imprimir as saudações geradas
		System.out.println("Opção1 - Usando Method Reference");
		listaSaudacoes.forEach(System.out::println);
		
		
		System.out.println("\nOpção2 - Usando Lambda");
		listaSaudacoes1.forEach(s -> System.out.println(s));
	}

}
