package ExerciciosFiama;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
	  
	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	        String[] opcoes = {"pedra", "papel", "tesoura", "lagarto", "Spock"};
	        Random rand = new Random();
	        String escolhaComputador = opcoes[rand.nextInt(5)];
	        System.out.println("Escolha pedra, papel, tesoura, lagarto ou Spock:");
	        String escolhaJogador = scanner.nextLine().toLowerCase();
	        String resultado = resultadoJogo(escolhaJogador, escolhaComputador);
	        System.out.println("Computador escolheu: " + escolhaComputador);
	        System.out.println(resultado);
	    }

	    public static String resultadoJogo(String jogador, String computador) {
	        switch (jogador) {
	            case "pedra":
	                switch (computador) {
	                    case "pedra": return "Empate!";
	                    case "tesoura": return "Pedra vence tesoura!";
	                    case "lagarto": return "Pedra vence lagarto!";
	                    case "papel": return "Papel vence pedra!";
	                    case "spock": return "Spock derrete a pedra!";
	                }
	            case "papel":
	                switch (computador) {
	                    case "pedra": return "Papel vence pedra!";
	                    case "tesoura": return "Tesoura vence papel!";
	                    case "lagarto": return "Lagarto vence papel!";
	                    case "papel": return "Empate!";
	                    case "spock": return "Papel vence Spock!";
	                }
	            case "tesoura":
	                switch (computador) {
	                    case "pedra": return "Pedra vence tesoura!";
	                    case "tesoura": return "Empate!";
	                    case "lagarto": return "Tesoura vence lagarto!";
	                    case "papel": return "Tesoura vence papel!";
	                    case "spock": return "Spock vence tesoura!";
	                }
	            case "lagarto":
	                switch (computador) {
	                    case "pedra": return "Pedra vence lagarto!";
	                    case "tesoura": return "Tesoura vence lagarto!";
	                    case "lagarto": return "Empate!";
	                    case "papel": return "Lagarto vence papel!";
	                    case "spock": return "Lagarto vence Spock!";
	                }
	            case "spock":
	                switch (computador) {
	                    case "pedra": return "Spock vence pedra!";
	                    case "tesoura": return "Spock vence tesoura!";
	                    case "lagarto": return "Spock vence lagarto!";
	                    case "papel": return "Papel vence Spock!";
	                    case "spock": return "Empate!";
	                }
	            default: return "Opção inválida!";
	        }
	    }
	}