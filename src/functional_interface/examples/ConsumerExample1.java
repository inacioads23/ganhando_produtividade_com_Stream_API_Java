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
		// Opção1
		System.out.println("Opção1\n[numeros.stream().forEach(imprimirNumeroPar);]");
		numeros.stream().forEach(imprimirNumeroPar);

		// Opção2
		System.out.println("\nOpção2\n[numeros.forEach(n -> {\n    if (n % 2 == 0) {\n    System.out.println(n);\n    }\n});]");
		numeros.forEach(n -> {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		});

		// Opção3
		System.out.println("\nOpção3\n[numeros.stream()\n    .filter(n -> n % 2 == 0)\n    .forEach(System.out::println);]");
		numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

}
