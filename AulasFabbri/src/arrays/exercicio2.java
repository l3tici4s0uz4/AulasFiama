package arrays;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[4];
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota do aluno " + (i + 1) + "° nota aluno: ");
			notas[i] = sc.nextDouble();
			soma += notas[i];
		}
			double media = soma / notas.length;
			System.out.println("A média das notas é:" + media);
			sc.close();
		}
	}


