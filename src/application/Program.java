package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double PI = 3.14159;
		
		
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double valorRaio = raio * raio;
		
		double areaCirculo = PI * valorRaio;
		System.out.printf("O valor da area do circulo e de: " + areaCirculo);
		
		
		
		
		sc.close();

	}

}
