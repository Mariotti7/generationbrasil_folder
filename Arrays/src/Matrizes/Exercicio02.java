package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  
			• A soma dos números pares digitados; 
			• Os números ímpares digitados; 
			• A quantidade de números ímpares digitados.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final int NUM = 6;
		int vector, par=0, impar=0, somaPar=0, somaImpar=0, cont = 1;
		
		System.out.println("----- É PAR OU IMPAR? -----");
		System.out.println();
		for(int i = 0; i < NUM; i++) {
			System.out.printf("Digite %dº número: ", cont++);
			vector = sc.nextInt();
			if((vector%2) == 0) {
				par++;
				somaPar = vector * par; 
			}else {
				impar++;
				somaImpar = vector * impar; 
			}
			
		}
		System.out.println();
		System.out.printf("Quantidade número[s] PAR digitado[s]: %d%n", par);
		System.out.printf("Soma dos números pares: %d%n",somaPar);
		System.out.println();
		System.out.printf("Quantidade número[s] IMPAR digitado[s]: %d%n", impar);
		System.out.printf("Soma dos números impares: %d%n", somaImpar);
		
		
		sc.close();
	}

}
