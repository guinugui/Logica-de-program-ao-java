package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B, C, D;
		
		System.out.println("Digite o valor de A: ");		
		A = sc.nextInt();
		System.out.println("Digite o valor de B: ");		
		B = sc.nextInt();
		System.out.println("Digite o valor de C: ");		
		C = sc.nextInt();
		System.out.println("Digite o valor de D: ");		
		D = sc.nextInt();
		
		int sum = (A * B - C * D);
		
		System.out.println("A diferença é de: " + sum);
		
		
		
		sc.close();

	}

}
