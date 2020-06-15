package aulas.udemy.java.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios88Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com a quantidade de produtos: ");
		int n = entrada.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i =0; i < vect.length; i++) {
			entrada.nextLine();
			System.out.println("Entre com um nome e preço do produto nº: "+ (i + 1));
			String name = entrada.nextLine();
			double price = entrada.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		entrada.close();
	}
}
