package entities;

import java.util.Locale;
import java.util.Scanner;

public class Consumidor {

	public static void main(String[] args) {
		/*
		 * O custo ao consumidor de um carro novo � a soma do custo de f�brica com a 
		 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Carro custo = new Carro();
		System.out.println("Sabe quanto realmente � o custo de um carro?");
		System.out.println();
		System.out.print("O custo de fabrica do carro �: ");
		custo.custoFabrica = sc.nextDouble();
		
		System.out.println();
		System.out.println(custo);

	}

}
