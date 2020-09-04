package exercicios;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class vetor001 {

	public static void main(String[] args) {
		/*
		 * Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa devera fazer uma busca do 
		 * valor de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado. 
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int[] vetor = new int [20];
		Random aleatorio;
		
		
		for(int i = 0; i < vetor.length ; i++) {
			aleatorio = new Random();
			int x = aleatorio.nextInt(10);
			System.out.println(x);
			if(x == vetor[i]) {
				
				System.out.println("Encontrei o seu número: " + i);
			}
		}
		
		sc.close();
	}

}
