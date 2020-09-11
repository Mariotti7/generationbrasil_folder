package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			� Os n�meros pares digitados;  
			� A soma dos n�meros pares digitados; 
			� Os n�meros �mpares digitados; 
			� A quantidade de n�meros �mpares digitados.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final int NUM = 6;
		int vector, par=0, impar=0, somaPar=0, somaImpar=0, cont = 1;
		
		System.out.println("----- � PAR OU IMPAR? -----");
		System.out.println();
		for(int i = 0; i < NUM; i++) {
			System.out.printf("Digite %d� n�mero: ", cont++);
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
		System.out.printf("Quantidade n�mero[s] PAR digitado[s]: %d%n", par);
		System.out.printf("Soma dos n�meros pares: %d%n",somaPar);
		System.out.println();
		System.out.printf("Quantidade n�mero[s] IMPAR digitado[s]: %d%n", impar);
		System.out.printf("Soma dos n�meros impares: %d%n", somaImpar);
		
		
		sc.close();
	}

}
