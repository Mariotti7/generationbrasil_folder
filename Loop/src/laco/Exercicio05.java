package laco;

import java.util.Random;

public class Exercicio05 {

	public static void main(String[] args) {
		/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		Random escolha = new Random();
		
		int num, sum = 0;
		
		do {
			System.out.print("Numeros aleat�rios: ");
			num = escolha.nextInt(300);
			System.out.println(num);
			sum++;
		}while(num != 0);
		
		System.out.printf("A soma dos n�meros digitados �: %d%n", sum);
	}

}
