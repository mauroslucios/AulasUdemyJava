package aulas.udemy.java.repeticao;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x=0, y =4;
		while(x < 3) {
			y = y + 2;
			x = x + 1;
			System.out.println(x + "-" + y);
		}
		
		
		entrada.close();
	}
}
