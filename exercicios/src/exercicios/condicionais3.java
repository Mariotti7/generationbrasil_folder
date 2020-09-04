package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class condicionais3 {

	public static void main(String[] args) {
		/*
		 * Desenvolva um sistema em que:
			Leia 4 (quatro) números;
			Calcule o quadrado de cada um;
			Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e
				finalize;
			Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numA, numB, numC, numD, sqrtA, sqrtB, sqrtC, sqrtD;
		
		System.out.println("Informe quatro números: ");
		numA = sc.nextDouble();
		numB = sc.nextDouble();
		numC = sc.nextDouble();
		numD = sc.nextDouble();
		
		sqrtA = Math.sqrt(numA);
		sqrtB = Math.sqrt(numB);
		sqrtC = Math.sqrt(numC);
		sqrtD = Math.sqrt(numD);
		if(sqrtC >= 1000) {
			System.out.printf("O resultante do quadrado do terceiro número informado é: %.2f", sqrtC);
		}else {
			System.out.printf("Resultante do quadrado do primeiro número informado é: %.2f%n", sqrtA);
			System.out.printf("Resultante do quadrado do segundo número informado é: %.2f%n", sqrtB);
			System.out.printf("Resultante do quadrado do terceiro número informado é: %.2f%n", sqrtC);
			System.out.printf("Resultante do quadrado do quarto número informado é: %.2f%n", sqrtD);
		}
		sc.close();
	}

}
