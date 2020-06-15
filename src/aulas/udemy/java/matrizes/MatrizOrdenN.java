package aulas.udemy.java.matrizes;

import java.util.Scanner;

public class MatrizOrdenN {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com os elementos da Matriz: ");
		int n = entrada.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int linha = 0; linha < n; linha ++) {
			for(int coluna = 0; coluna <  n; coluna ++) {
				mat[linha][coluna] = entrada.nextInt();
			}
		}
		
		System.out.println("A Matriz preenchida: ");
		for(int linha = 0; linha < mat.length; linha++) {
			for(int coluna = 0; coluna < mat[linha].length; coluna ++ ) {
				System.out.print(mat[linha][coluna] );
			}
		}
		System.out.println();
		
		System.out.print("Main diagonal: ");
		for(int i = 0;i < mat.length ;i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for(int linha = 0; mat.length <n; linha++) {
			for(int coluna = 0; coluna < mat[linha].length; coluna ++) {
				if(mat[linha][coluna] < 0) {
					count++;
				}
			}
		}
		System.out.println("Quantity negative numbers: " + count);
		entrada.close();
	}
}
