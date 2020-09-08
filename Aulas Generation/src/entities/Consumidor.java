package entities;

import java.util.Locale;
import java.util.Scanner;

public class Consumidor {

	public static void main(String[] args) {
		/*
		 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
		 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Carro custo = new Carro();
		System.out.println("Sabe quanto realmente é o custo de um carro?");
		System.out.println();
		System.out.print("O custo de fabrica do carro é: ");
		custo.custoFabrica = sc.nextDouble();
		
		System.out.println();
		System.out.println(custo);

	}

}
