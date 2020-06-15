package aulas.udemy.java.matrizes;

import java.util.Scanner;

public class Matriz2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com a quantidade de linha da matriz: ");
		int m = entrada.nextInt();
		
		System.out.print("Entre com a quantidade de coluna da matriz: ");
		int n = entrada.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++ ) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j]= entrada.nextInt();
			}
		}
		
		System.out.print("Entre com o número para achar sua posição:");
		int x = entrada.nextInt();
		
		for(int i =0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.print("Position " + i + "," + j + ":");
					
					if(j > 0) {
						System.out.println("Left : " + mat[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(j < mat[i].length -1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if(i < mat.length - 1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		entrada.close();
	}
}
