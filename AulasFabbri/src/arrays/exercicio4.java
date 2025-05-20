package arrays;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int [3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++ ) {
				System.out.println("Digite o valor para posição [" + i + "] [" + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < 3; i++) {
		System.out.println(matriz[i][i] + " ");
	 }
	
   }

}
