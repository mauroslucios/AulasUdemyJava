package aulas.udemy.java.condicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o dia da semana em números:");
		int x = entrada.nextInt();

		switch (x) {
		case 1: if(x == 1) {
			System.out.println("segunda-feira");
			break;
		}
		case 2: if(x == 2) {
				System.out.println("terça-feira");
				break;
			}
		case 3: if(x == 3) {
			System.out.println("quarta-feira");
		}
		case 4: if(x == 4) {
			System.out.println("quinta-feira");
			break;
		}
		case 5: if(x == 5 ) {
			System.out.println("sexta-feira");
			break;
		}
		case 6: if(x == 6) {
			System.out.println("sábado");
			break;
		}
		case 7: if(x == 7) {
			System.out.println("domingo");
			break;
		}
		default: System.out.println("dia inválido");
			break;
		}

		entrada.close();
	}
}
