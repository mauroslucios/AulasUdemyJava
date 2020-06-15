package aulas.udemy.java.exercicios.poo;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAluno {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Enter with the Name: ");
		aluno.nome = entrada.nextLine();
		System.out.print("Enter with the grade1: ");
		aluno.grade1 = entrada.nextDouble();
		System.out.print("Enter with the grade2: ");
		aluno.grade2 = entrada.nextDouble();
		System.out.print("Enter with the grade3: ");
		aluno.grade3 = entrada.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", aluno.finalGrade());
		
		if(aluno.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
		}else {
			System.out.println("YOU PASSED");
		}
		
		
		entrada.close();
	}
}
