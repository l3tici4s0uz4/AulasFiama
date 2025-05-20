package ExerciciosFiama;

import java.util.Scanner;

public class SenhasIncomuns {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		String senha = scanner.nextLine();
		scanner.nextLine();

		if (validarSenha(senha)) {
			System.out.println("Senha válida!");
		} else {
			System.out.println("Senha inválida!");
		}
	}

	public static boolean validarSenha(String senha) {
		boolean temMaiuscula = false;
		boolean temNumeroPrimo = false;
		boolean temCaractereEspecial = false;

		for (char c : senha.toCharArray()) {
			if (Character.isUpperCase(c)) {
				temMaiuscula = true;
			}
			if (Character.isLetterOrDigit(c)) {
				temCaractereEspecial = true;
			}
		}

		for (int i = 0; i < senha.length() - 1; i++) {
			if ("aeiou".contains(String.valueOf(senha.charAt(i))) && senha.charAt(i) == senha.charAt(i + 1)) {
				return false;

			}

		}

		return temMaiuscula && temCaractereEspecial;

	}
}
