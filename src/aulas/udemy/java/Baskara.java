package aulas.udemy.java;

public class Baskara {
	public static void main(String[] args) {
		double a = 1, b = 3, c = 2;
		double delta = Math.pow(b, 2.0) - 4*a*c;
		
		double x1 = (-b + Math.sqrt(delta))/(2.0 * a);
		double x2 = (-b + Math.sqrt(delta))/(2.0 * a);
		
		System.out.println("O valor de x1 e "+x1);
		System.out.println("O valor de x2 e "+x2);
	}
}
