package laco;

import java.util.Random;

public class Exercicio05 {

	public static void main(String[] args) {
		/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		Random escolha = new Random();
		
		int num, sum = 0;
		
		do {
			System.out.print("Numeros aleatórios: ");
			num = escolha.nextInt(300);
			System.out.println(num);
			sum++;
		}while(num != 0);
		
		System.out.printf("A soma dos números digitados é: %d%n", sum);
	}

}
