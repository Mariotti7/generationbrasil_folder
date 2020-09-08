package entities;

import java.util.Locale;
import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		/*
		 * Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
		 * P(x1, y1) e P(x2, y2), escreva a distância entre eles.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Formula calculo = new Formula();
		System.out.println("Escreva a distância entre os pontos: P(x1, y1) e P(x2, y2)");
		System.out.println();
		
		System.out.print("Informe o ponto X1: ");
		calculo.X1 = sc.nextDouble();
		System.out.print("Informe o ponto X2: ");
		calculo.X2 = sc.nextDouble();
		System.out.print("Informe o ponto Y1: ");
		calculo.Y1 = sc.nextDouble();
		System.out.print("Informe o ponto Y2: ");
		calculo.Y2 = sc.nextDouble();
		
		System.out.println();
		System.out.println(calculo);
		sc.close();

	}

}
