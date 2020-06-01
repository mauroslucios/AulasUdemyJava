package AulasUdemyJava.repeticao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		char resp = 's';
		
		do {
		System.out.println("Digite uma temperatura em Celsius:");
		double C = entrada.nextDouble();
		
		double F = (9.0 * C) / 5 + 32.0;
		System.out.printf("O equivalente em Fahrenheit: %.1f%n", F);
		
		System.out.println("Deseja repetir (s/n)?");
		resp = entrada.next().charAt(0);
		}while(resp != 'n');
		
		System.out.println("Você saiu do programa!");
		
		entrada.close();
	}
}
