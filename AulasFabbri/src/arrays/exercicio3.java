package arrays;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int [2] [3];
		int soma = 0;
		
		for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
		System.out.println("Digite o valor para posição [" + i + "][" + j + "]: ");
		matriz [i][j] = sc.nextInt();
		soma += matriz[i][j];
		}
	}
		
		System.out.println("A soma de todos os elementos é: " + soma);
		sc.close();
	}

}