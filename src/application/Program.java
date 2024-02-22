package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y;
		
		System.out.println("Digite x: ");
		x = sc.nextInt();
		System.out.println("Digite x: ");
		y = sc.nextInt();
		
		
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if(x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}
			System.out.println("Digite x: ");
			x = sc.nextInt();
			System.out.println("Digite Y: ");
			y = sc.nextInt();
		
		}

		System.out.println("Encerrado!");
		


		sc.close();

	}

}
