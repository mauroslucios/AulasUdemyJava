package AulasUdemyJava.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com os minutos:");
		int minutos = entrada.nextInt();
		
		double conta = 50.0;
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("O valor da conta foi de: R$ %.2f%n",conta);
		
		entrada.close();
	}
}
