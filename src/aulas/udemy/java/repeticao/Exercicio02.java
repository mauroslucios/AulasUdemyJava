package aulas.udemy.java.repeticao;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		int v = entrada.nextInt();
		
		int soma = 0;
		for(int i = 0; i < v; i++) {
			int x = entrada.nextInt();
			soma += x;
		}
		System.out.println("Os valores somados são: "+ soma);
		entrada.close();
	}
	
}
