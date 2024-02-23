package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Digite um numero: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			double divisao = (double)x / y;
			if(y == 0.0){
				System.out.println("divisao impossivel");
			}else {
				System.out.println(divisao);
				
			}
			
		}
		
		
		sc.close();

	}

}
