package aulas.udemy.java.exercicios;

import java.util.Scanner;

/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
 8 mensagem explicativa, conforme exemplos.
 */
public class Exercicio01 {

	public static void main(String[] args) {
		int soma = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com 2(dois) valores inteiros para somar:");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		soma = a + b;
		System.out.println("O resultado da soma e: "+soma);
		
		entrada.close();
	}
}
