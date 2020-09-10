package laco;

import java.util.Locale;
import java.util.Random;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Escrever um programa que receba vários números inteiros no teclado. 
		 *E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */
		Locale.setDefault(Locale.US);
		Random escolha = new Random();
		
		int num, soma = 0, contador = 0;
		double media = 0;
		
		do {
			System.out.print("Números aleatórios: ");
			num = escolha.nextInt(100);
			System.out.println(num);
			if((num % 3) == 0 && (num != 0)) {
				soma += num;
				contador++;
			}
		}while(num != 0);

		media = soma / contador;
		System.out.println();
		System.out.printf("A média dos números múltiplos de 3 é: %.2f%n", media);
	}

}
