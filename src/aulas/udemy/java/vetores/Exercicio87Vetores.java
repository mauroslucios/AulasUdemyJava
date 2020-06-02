package aulas.udemy.java.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio87Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o numero de tentaivas: ");
		int n = entrada.nextInt();
		double [] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = entrada.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		entrada.close();
		
	}
}
