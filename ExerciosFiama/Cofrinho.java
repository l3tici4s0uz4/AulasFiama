package ExerciciosFiama;

import java.util.Scanner;

public class Cofrinho {
	    public static void main(String[] args) {
	    	        Scanner sc = new Scanner(System.in);
	    	        double total = 0;
	    	        int opcao;

	    	        do {
	    	            System.out.println("\n1 - R$0,01");
	    	            System.out.println("2 - R$0,05");
	    	            System.out.println("3 - R$0,10");
	    	            System.out.println("4 - R$0,25");
	    	            System.out.println("5 - R$0,50");
	    	            System.out.println("6 - R$1,00");
	    	            System.out.println("7 - Sair");
	    	            System.out.print("Escolha: ");
	    	            opcao = sc.nextInt();

	    	            if (opcao >= 1 && opcao <= 6) {
	    	                System.out.print("Quantas moedas? ");
	    	                int qtd = sc.nextInt();

	    	                switch (opcao) {
	    	                    case 1: total += qtd * 0.01; break;
	    	                    case 2: total += qtd * 0.05; break;
	    	                    case 3: total += qtd * 0.10; break;
	    	                    case 4: total += qtd * 0.25; break;
	    	                    case 5: total += qtd * 0.50; break;
	    	                    case 6: total += qtd * 1.00; break;
	    	                }
	    	            }

	    	        } while (opcao != 7);

	    	        System.out.printf("\nTotal: R$ %.2f\n", total);

	    	        if (total >= 100) {
	    	            System.out.println("Você já tem R$100 ou mais.");
	    	        } else {
	    	            System.out.printf("Falta R$ %.2f para chegar a R$100.\n", 100 - total);
	    	        }

	    	        sc.close();
	    	    }
	      }

