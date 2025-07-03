package functional_interface.examples;

// Consumer<T>: Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
// É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor.

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {
	public static void main(String[] args) {
		// Cria uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

		// Usar o Consumer com expressão lambda para imprimir números pares
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		};

		// Usar o Consumer para imprimir números pares no Stream
		// Opção1
		System.out.println("Opção1");
		numeros.stream().forEach(imprimirNumeroPar);

		// Opção2
		System.out.println("\nOpção2");
		numeros.forEach(n -> { // apenas Lambda
			if (n % 2 == 0) {
				System.out.println(n);
			}
		});

		// Opção3
		System.out.println("\nOpção3");
		numeros.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println); // Imprime com Method Reference
	}
}
