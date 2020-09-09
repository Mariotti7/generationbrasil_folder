package Condition;

import java.util.Locale;
import java.util.Scanner;

import ClassesType.ClasseEx04;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
		 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------ Descubra se o número é par ou ímpar ------");
		System.out.println();
		
		ClasseEx04 numero = new ClasseEx04();
		System.out.print("Digite um número: ");
		numero.numero = sc.nextInt();
		
		System.out.println();
		System.out.println(numero);
		
		
		sc.close();
	}

}
