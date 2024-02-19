package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, quantity1, quantity2;
		double price1, price2, totalValue;
		
		System.out.println(" Codigo do primeiro produtos");
		cod1 = sc.nextInt();
		System.out.println("quantity product: ");
		quantity1 = sc.nextInt();
		System.out.println("price one product: ");
		price1 = sc.nextDouble();
		
		
		System.out.println(" Codigo do segundo produtos");
		cod2 = sc.nextInt();
		System.out.println("quantity product: ");
		quantity2 = sc.nextInt();
		System.out.println("price two product: ");
		price2 = sc.nextDouble();
		
		totalValue = (quantity1 * price1) + (quantity2 * price2);
		
		System.out.println("o valor total a pagar e de: " + totalValue);
		
		
		
		
		
		sc.close();

	}

}
