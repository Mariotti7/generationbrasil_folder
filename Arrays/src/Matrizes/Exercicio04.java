package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * - Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
			(1) somar as duas matrizes 
			(2) subtrair a primeira matriz da segunda 
			(3) adicionar uma constante as duas matrizes
			(4) imprimir as matrizes 
				Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
				Na terceira opção o valor da constante deve ser lido e o resultado da adição da 
				constante deve ser armazenado na própria matriz.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2]; 
		
		double soma = 0, menos = 0, add1 = 0, add2 = 0;
			
		System.out.println("BRINCANDO COM MATRIZES");
		System.out.println();
		
		for(int linha = 0 ; linha < 2 ; linha++) {
			for(int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Insira o numero da matriz1 [%d][%d]: ", linha+1, coluna+1);
				matriz1[linha][coluna] = sc.nextDouble();
				add1++;
				System.out.printf("Insira o numero da matriz2 [%d][%d]: ", linha+1, coluna+1);
				matriz2[linha][coluna] = sc.nextDouble();
				add2++;
				soma = matriz1[linha][coluna]+ matriz2[linha][coluna];
				menos = matriz1[linha][coluna] - matriz2[linha][coluna];
			}
		}
		System.out.println("\n Matriz1 ficou: \n");
		for(int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<2; coluna++) {
				System.out.printf("\t %.1f \t",matriz1[linha][coluna]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("\n Matriz2 ficou: \n");
		for(int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<2; coluna++) {
				System.out.printf("\t %.1f \t",matriz2[linha][coluna]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("\n A soma das Matrizes ficou: \n");
		for(int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<2; coluna++) {
				System.out.printf("\t %.1f \t",soma);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("\n A subtração das Matrizes ficou: \n");
		for(int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<2; coluna++) {
				System.out.printf("\t %.1f \t",menos);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("\n A lendo uma constante na Matriz1 ficou: \n");
		for(int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<2; coluna++) {
				matriz1[linha][coluna] += add1;
				System.out.printf("\t %.1f \t",matriz1[linha][coluna]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("\n A lendo uma constante na Matriz2 ficou: \n");
		for(int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<2; coluna++) {
				matriz2[linha][coluna] += add2;
				System.out.printf("\t %.1f \t",matriz2[linha][coluna]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		sc.close();
	}

}
