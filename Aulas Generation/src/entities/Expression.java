package entities;

import java.util.Locale;
import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		/*
		 * Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
		 D = (R + S) / 2, onde, R = ((A*A)+(B*B)) e S =((B*B)+(C*C))
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		MathExpression calculo = new MathExpression();
		System.out.println("Calcule a expressão D = (R + S)");
		System.out.println();
		System.out.print("Atribua um valor numérico inteiro e positivo para A: ");
		calculo.A = sc.nextDouble();
		System.out.print("Atribua um valor numérico inteiro e positivo para B: ");
		calculo.B = sc.nextDouble();
		System.out.print("Atribua um valor numérico inteiro e positivo para C: ");
		calculo.C = sc.nextDouble();
		
		System.out.println();
		System.out.println(calculo);
		
		
		sc.close();

	}

}
