package AulasUdemyJava;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com seu nome:");
		String nome = entrada.nextLine();

		System.out.println("Entre com sua idade:");
		int idade = entrada.nextInt();

		System.out.println("Entre com a unidade federal de seu nascimento:");
		// char uf = entrada.next().charAt();
		String uf = entrada.nextLine();
		
		Locale.setDefault(Locale.US);
		System.out.println("Entre com seu salário:");
		double salario = entrada.nextDouble();

		System.out.println("");

		System.out.println("Olá " + nome);
		System.out.println("Você tem " + idade + " anos");
		System.out.printf("Você nasceu no estado de: %c%n", uf);
		System.out.printf("Seu salário é de: R$ %.2f %n", salario);

		entrada.close();
	}
}
