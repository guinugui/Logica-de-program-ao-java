package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int senha;
		
		System.out.println("Digite a senha correta");
		senha = sc.nextInt();
		while(senha != 2002) {
			System.out.println("senha incorreta");
			senha = sc.nextInt();
		}

		System.out.println("Acesso permitido");
		


		sc.close();

	}

}
