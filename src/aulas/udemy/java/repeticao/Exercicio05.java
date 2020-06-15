package aulas.udemy.java.repeticao;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//0b100000
		int mask = 32;
		
		System.out.println("Entre com um número:");
		int n = entrada.nextInt();
		
		if((n & mask) != 0 ) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		
		entrada.close();
	}
}
