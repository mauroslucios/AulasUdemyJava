package aulas.udemy.java.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Entre com as hora:");
		double horas = entrada.nextDouble();
		
		
		if( horas < 12) {
			System.out.println("Bom dia");
		}
		else if(horas < 18 ) {
			System.out.println("Boa tarde");
		}
		else{
			System.out.println("Boa noite");
		}
		
		
		entrada.close();
	}
}
