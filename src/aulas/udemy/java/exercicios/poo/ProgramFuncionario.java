package aulas.udemy.java.exercicios.poo;

import java.util.Locale;
import java.util.Scanner;

public class ProgramFuncionario {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Enter with the name of employee: ");
		func.name = entrada.nextLine();
		
		System.out.print("Enter with the grossSalary of employee: ");
		func.grossSalary = entrada.nextDouble();
		
		System.out.print("Enter with the taxa of employee: ");
		func.tax = entrada.nextDouble();
		
		System.out.println();
		System.out.print("Employee: "+ func);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = entrada.nextDouble();
		func.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: "+ func);
		
		entrada.close();
	}
}
