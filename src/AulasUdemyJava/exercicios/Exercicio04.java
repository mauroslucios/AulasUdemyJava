package AulasUdemyJava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o nome do funcionario:");
		String nome = entrada.nextLine();
		System.out.println("Entre com o número de registro do funcionario:");
		int registro = entrada.nextInt();
		System.out.println("Entre com as horas trabalhadas:");
		double horas = entrada.nextDouble();
		System.out.println("Entre com o valor da hora:");
		double vHoras = entrada.nextDouble();
		
		Locale.setDefault(Locale.US);
		double salario = horas * vHoras;
		System.out.println("Número de Registro: "+ registro);
		System.out.println("Nome Funcionario: "+ nome);
		System.out.printf("Salario:U$  %.2f%n", salario);
		
		entrada.close();
	}
}
