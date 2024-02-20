package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number;
		
		System.out.println(" Digite um numero: ");
		number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("ESTE NUMERO E PAR");
		}
		else {
			System.out.println("ESTE NUMERO E IMPAR");
		}
		
		
		
		
		
		sc.close();

	}

}
