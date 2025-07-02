package functional_interface.examples;

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
		System.out.println("Opção1\n[numeros.stream().forEach(imprimirNumeroPar);]");
		numeros.stream().forEach(imprimirNumeroPar);

		System.out.println("\nOpção2\n[numeros.stream()\n    .filter(n -> n % 2 == 0)\n    .forEach(System.out::println);]");
		numeros.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
	}

}
