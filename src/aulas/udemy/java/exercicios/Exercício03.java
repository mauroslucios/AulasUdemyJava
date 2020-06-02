package aulas.udemy.java.exercicios;
/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

import java.util.Scanner;

public class Exercício03 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com 4 valores:");
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		int C = entrada.nextInt();
		int D = entrada.nextInt();
		
		int produto = (A*B-(C*D));
		
		System.out.println("A diferença do produto de A,B com o produto D,C e de: "+ produto);
		
		entrada.close();
	}
	
}
