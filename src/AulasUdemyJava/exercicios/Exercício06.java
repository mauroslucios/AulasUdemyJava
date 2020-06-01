package AulasUdemyJava.exercicios;

import java.util.Scanner;

/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
   mostre:
   a) a área do triângulo retângulo que tem A por base e C por altura.
   b) a área do círculo de raio C. (pi = 3.14159)
   c) a área do trapézio que tem A e B por bases e C por altura.
   d) a área do quadrado que tem lado B.
   e) a área do retângulo que tem lados A e B.
 */
public class Exercício06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com três valores: ");
		double A = entrada.nextDouble();
		double B = entrada.nextDouble();
		double C = entrada.nextDouble();
		
		double triangulo = (A * C)/2;
		double circulo = (C * C) * 3.14159;
		double trapezio = (A + B) / 2.0 * C;
		double quadrado = B * B;
		double retangulo = A * B;
		
		System.out.printf("Triangulo: %.3f %n", triangulo);
		System.out.printf("Circulo: %.3f %n", circulo);
		System.out.printf("Trapézio: %.3f %n", trapezio);
		System.out.printf("Quadardo: %.3f %n", quadrado);
		System.out.printf("Retangulo: %.3f %n", retangulo);
		
		entrada.close();
	}
}
