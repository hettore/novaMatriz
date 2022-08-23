package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Digite o tamanho de linhas da sua matriz: ");
		int m = sc.nextInt();
		System.out.println("Digite o tamanho de colunas da sua matriz: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println("Digite os números que compoem sua matriz: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
			
		}
		//System.out.println(mat);

		System.out.println();
		System.out.print("Qual número você quer procurar? ");
		x = sc.nextInt();
		
		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			
			}
		}
		
		sc.close();
	}

}
