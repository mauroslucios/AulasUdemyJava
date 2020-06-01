package AulasUdemyJava.exercicios;

import java.util.Scanner;

/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
 * casas decimais conforme exemplos.
 */

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o valor do raio:");
		double raio = entrada.nextDouble();
		double area = raio * 3.14159;
		System.out.printf("O valor da area e: %.4f %n", area);
		
		entrada.close();
	}
}
