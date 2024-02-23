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

		for (int i = 0; i <= number; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
		sc.close();

	}

}
