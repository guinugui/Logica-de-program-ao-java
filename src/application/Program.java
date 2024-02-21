package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number;

		System.out.println("Digite um numero: ");
		number = sc.nextInt();

		
		if (number <= 0.0 || number >=100 ) {
			System.out.println("Fora de intervalor");
		} else if (number <= 25) {
			System.out.println("Intervalor entr (0, 25]");
		} else if (number <= 50) {
			System.out.println("Intervalor entr (25, 50]");
		} else if (number <= 75) {
			System.out.println("Intervalor entr (50, 75]");
		} else {
			System.out.println("Intervalor entr (75, 100]");
		}

		sc.close();

	}

}
