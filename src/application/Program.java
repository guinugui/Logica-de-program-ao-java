package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number, quantity;

		System.out.println("quanto do numero do pedido: ");
		number = sc.nextInt();
		System.out.println("quantas unidades : ");
		quantity = sc.nextInt();

		double total;
		if (number == 1) {
			total = quantity * 4.0;
		} else if (number == 2) {
			total = quantity * 4.5;
		} else if (number == 3) {
			total = quantity * 5.0;
		} else if (number == 4) {
			total = quantity * 2.0;
		} else {
			total = quantity * 1.5;
		}

		System.out.println("o valor total fica: " + total);

		sc.close();

	}

}
