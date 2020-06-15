package aulas.udemy.java.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio89Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("How many rooms will be rented:");
		int n = entrada.nextInt();
		
		RoomsRented[] vect = new RoomsRented[n];
		int i;
		for(i = 1; i <= vect.length ; i++) {
			entrada.nextLine();
			System.out.print("Entre com o nome do estudante nº "+ i + ": ");
			String name = entrada.nextLine();
			System.out.print("Entre com o e-mail do estudante nº " + i + ": ");
			String email = entrada.nextLine();
			System.out.print("Entre com o número do quarto nº " + i + ": ");
			int room = entrada.nextInt();
			entrada.nextLine();
			System.out.println();
			vect[i] = new RoomsRented(name, email, room);
			
		}
		System.out.println(vect[i]);

		
		
		entrada.close();
	}
}
