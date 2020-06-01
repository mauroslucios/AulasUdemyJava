package AulasUdemyJava.exercicios;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 0;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("o valor de a = "+ a);
		System.out.println("o valor de b = "+ b);
		System.out.println("O perímetro: "+ perimetro(2));
		System.out.println("O perímetro: "+ area(2));
		
}
	
	public static double perimetro(double raio){
	    return (raio * 2) * 3.14;
	}

	public static double area(double raio){
	    return (raio * raio) * 3.14;
	}
}
