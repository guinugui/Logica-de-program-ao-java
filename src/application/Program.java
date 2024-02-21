package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B;

		System.out.println("Digite um numero: ");
		A = sc.nextDouble();
		System.out.println("Digite um numero: ");
		B = sc.nextDouble();

		
		if (A == 0.0 && B == 0 ) {
			System.out.println("Origem");
		} else if (A == 0) {
			System.out.println("Eixo B");
		} else if (B == 0) {
			System.out.println("Eixo A");
		} else if (A > 0 && B > 0) {
			System.out.println("Q1");
		} else if (A < 0 && B > 0) {
			System.out.println("Q2");
		} else if (A < 0 && B < 0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}

		sc.close();

	}

}
