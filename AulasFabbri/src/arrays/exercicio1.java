package arrays;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] numeros = new int [5];
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o número " + (i + 1) + ":");
			numeros[i] = sc.nextInt();
			if (numeros [i] > maior);{
				maior = numeros[i];
		
		}

	}
	
      System.out.println("O maior número é:" + maior);
      sc.close();

		}

}