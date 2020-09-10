package laco;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe sua idade: ");
		int age = sc.nextInt();
		int soma21 = 0;
		int soma50 = 0;
		
		while(age != -99) {
			if(age < 21) {
				soma21++;
			}
			if(age > 50) {
				soma50++;
			}
			System.out.print("Digite -99 para sair: ");
			age = sc.nextInt();
			if(age == -99) {
				break;
			}
			age++;
		}
		System.out.println();
		System.out.printf("Pessoas com menos de 21 anos: %d%n", soma21);
		System.out.printf("Pessoas com mais de 50 anos: %d%n", soma50);

		sc.close();
	}
	
}
