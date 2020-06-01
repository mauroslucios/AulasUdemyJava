package AulasUdemyJava;

public class Casting {

	public static void main(String[] args) {
		int a, b;
		double c = 3, resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a / b;
		System.out.println(resultado);
		
		b = (int) c;
		
		System.out.println(b);
	}
}
