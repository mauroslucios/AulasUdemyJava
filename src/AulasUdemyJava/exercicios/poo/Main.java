package AulasUdemyJava.exercicios.poo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangule width and height: ");
		retangulo.width = entrada.nextDouble();
		retangulo.height = entrada.nextDouble();
		
		System.out.println();
		System.out.printf("The area rectangule is : %.2f%n", retangulo.area());
		System.out.printf("The perimetr is : %.2f%n", retangulo.perimeter());
		System.out.printf("The diagonal is: %.2f%n", retangulo.diagonal());
		
		
		entrada.close();
	}
}
