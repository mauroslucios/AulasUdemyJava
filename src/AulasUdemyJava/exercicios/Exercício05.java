package AulasUdemyJava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercício05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com a quantidade da primeira peça:");
		int qtdPeca1 = entrada.nextInt();
		System.out.println("Entre com o valor da primeira peca:");
		double vPeca1 = entrada.nextDouble();
		
		System.out.println("Entre com a quantidade da segunda peça:");
		int qtdPeca2 = entrada.nextInt();
		System.out.println("Entre com o valor da segunda peca:");
		double vPeca2 = entrada.nextDouble();
		
		double peca1 = (qtdPeca1*vPeca1);
		double peca2 = (qtdPeca2*vPeca2);
		Locale.setDefault(Locale.US);
		System.out.printf("O valor total da compra e de: %.2f%n",(peca1+peca2));
		entrada.close();
	}
}
