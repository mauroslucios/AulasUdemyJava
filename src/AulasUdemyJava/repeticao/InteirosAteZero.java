package AulasUdemyJava.repeticao;

import java.util.Scanner;

public class InteirosAteZero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um inteiro até zero");
		int n = entrada.nextInt();
		
		int soma = 0;
		
		while(n != 0) {
			soma += n;
			n = entrada.nextInt();
			
		}
		
		System.out.println("Total da soma dos inteiros: "+soma);
		entrada.close();
	}
}
