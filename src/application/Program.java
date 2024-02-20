package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int inicio, fim, duracao;
		
		System.out.println(" Digite um numero 1: ");
		inicio = sc.nextInt();
		System.out.println(" Digite um numero 2: ");
		fim = sc.nextInt();
		
		if(inicio < fim) {
			duracao = fim - inicio;
		}
		else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.println("o jogo durou " + duracao + " horas!"); 
		
		
		
		
		sc.close();

	}

}
