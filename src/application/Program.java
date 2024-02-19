package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Digite um numero: ");
		double primeiro = sc.nextDouble();
		System.out.println("Digite outro numero: ");
		double segundo = sc.nextDouble();
		
		System.out.println("a soma desses numeros e de: ");
		double sum = primeiro + segundo;
		System.out.println("A soma de " + primeiro + " + " + segundo + " é de: " + sum);
		
		
		
		
		sc.close();

	}

}
