package exercicios;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class matriz001 {

	public static void main(String[] args) {
		/*
		 * Leia uma matriz 10 x 10 e escreva a localização (linha e a coluna) do maior valor.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int VALOR = 10;
		int[][] matriz = new int [VALOR][VALOR];
		int linha, coluna, maiorValor = 0, auxColuna = 0;
		Random aleatorio = new Random();
		
		for(linha = 0; linha<VALOR; linha++ ) {
			for(coluna = 0; coluna<VALOR; coluna++) {
				matriz[linha][coluna] = aleatorio.nextInt(20);
				System.out.println(" " + matriz[linha][coluna] + " ");
				if(maiorValor < matriz[linha][coluna]) {
					maiorValor = matriz[linha][coluna];
					auxColuna = coluna;
				}
			}
			
		}
		System.out.println("\n");
		
		for(linha = 0; linha<VALOR; linha++ ) {
			for(coluna = 0; coluna<VALOR; coluna++) {
				if(maiorValor == matriz[linha][coluna]) {
					System.out.println("Maior Valor está na linha " + (linha+1) + " coluna " + (coluna+1));
					System.out.println("\n");
				}
			}
		
		
	}
		sc.close();
}
}
