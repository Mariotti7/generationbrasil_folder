package entities;

import java.util.Locale;
import java.util.Scanner;

public class EquacaoLinear {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		FormulaEquacao equacao = new FormulaEquacao();
		
		System.out.println(" ------ Escreva os coeficientes abaixo ------ ");
		
		System.out.print("A: ");
		equacao.a = sc.nextDouble();
		System.out.print("B: ");
		equacao.b = sc.nextDouble();
		System.out.print("C: ");
		equacao.c = sc.nextDouble();
		System.out.print("D: ");
		equacao.d = sc.nextDouble();
		System.out.print("E: ");
		equacao.e = sc.nextDouble();
		System.out.print("F: ");
		equacao.f = sc.nextDouble();
		
		System.out.println();
		System.out.println(equacao);
		
		sc.close();

	}

}
