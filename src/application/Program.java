package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number1, number2;
		
		System.out.println(" Digite um numero 1: ");
		number1 = sc.nextInt();
		System.out.println(" Digite um numero 2: ");
		number2 = sc.nextInt();
		
		if(number1 % number2 == 0 || number2 % number1 == 0) {
			System.out.println("ESTE NUMERO SAO MULTIPLOS");
		}
		else {
			System.out.println("ESTE NUMERO NAO SAO MULTIPLOS");
		}
		
		
		
		
		
		sc.close();

	}

}
