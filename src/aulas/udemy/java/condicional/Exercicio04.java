package aulas.udemy.java.condicional;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com preço do produto:");
		double preco = entrada.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;
		
		System.out.printf("O desconto é de: R$ %.2f%n", desconto);
		System.out.printf("O valor com desconto é de: R$ %.2f%n", preco - desconto);
		entrada.close();
	}

}
