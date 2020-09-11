package Matrizes;

import java.util.Locale;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
		 * O programa deve executar os seguintes passos: 
			(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
			(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] 
			do vetor e mostre na tela esta soma. 
			(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
			(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
			
		Locale.setDefault(Locale.US);
		
		int[] A = {1, 0, 5, -2, -5, 7};
		int somaPosicao = 0;
		int cont = 0;
		A[4] = 100;
		
		System.out.println("---- BRINCANDO COM VETORES ----");
		System.out.println();
		
		for(int i = 0; i < A.length; i++) {
			somaPosicao = (A[0] + A[1] + A[5]);
			System.out.printf("Indice %d: %d%n", cont++ ,A[i]);
			
		}
		System.out.println();
		System.out.printf("Soma entre os valores das posições: A[0], A[1] e A[5] é %d%n", somaPosicao);

	}

}
