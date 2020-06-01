package AulasUdemyJava.funcoes;

import java.util.Locale;
import java.util.Scanner;

public class NotPOO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Enter the mreasures of triangle x: "); 
		double xA = entrada.nextDouble();
		double xB = entrada.nextDouble();
		double xC = entrada.nextDouble();
		
		System.out.println("Enter the measures of triangle y: "); 
		double yA = entrada.nextDouble();
		double yB = entrada.nextDouble();
		double yC = entrada.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p *(p-xA)*(p-xB)*(p-xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p *(p-yA)*(p-yB)*(p-yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		entrada.close();
	}
}
