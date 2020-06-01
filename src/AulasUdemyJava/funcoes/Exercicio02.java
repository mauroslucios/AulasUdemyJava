package AulasUdemyJava.funcoes;

import java.util.Locale;
import java.util.Scanner;

import AulasUdemyJava.entities.Triangle;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = entrada.nextDouble();
		x.b = entrada.nextDouble();
		x.c = entrada.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = entrada.nextDouble();
		y.b = entrada.nextDouble();
		y.c = entrada.nextDouble();
		
		/*double p =(x.a + x.b + x.c)/2.0;
		double areax = Math.sqrt(p * (p - x.a)*(p - x.b)*(p - x.c));*/
		double areax = x.area();
		
		/*p = (y.a + y.b + y.c)/2.0;
		double areay = Math.sqrt(p * (p - y.a) * (p -y.b) * (p - y.c));*/
		double areay = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areax);
		System.out.printf("Triangle Y area: %.4f%n", areay);
		
		if(areax > areay) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: y");
		}
		
		
		entrada.close();
	}
}
