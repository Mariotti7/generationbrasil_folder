package entities;

import java.util.Locale;
import java.util.Scanner;
import entities.Duration;

public class Factory {

	public static void main(String[] args) {
		/*
		 * Faça um sistema que leia o tempo de duração de um evento em uma 
		 * fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Duration duracao = new Duration();
		System.out.println("------------ Event Factory Prime ------------");
		System.out.println("Informe quanto tempo durou o evento: ");
		System.out.print("Em segundos: ");
		duracao.second = sc.nextInt();
		
		System.out.println();
		System.out.println(duracao);
		
		sc.close();
		
	}

}
