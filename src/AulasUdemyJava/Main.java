package AulasUdemyJava;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		String nome  = "Mauro";
		int idade = 50;
		double renda = 5000.0;
		System.out.printf("%s tem %d anos e ganga R$ %.2f reais %n",nome, idade, renda);
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n",x);
		System.out.println("Resultado " + x);
				
	}
}
