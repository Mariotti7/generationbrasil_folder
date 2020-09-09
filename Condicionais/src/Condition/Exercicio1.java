package Condition;

import java.util.Locale;
import java.util.Scanner;

import ClassesType.ClassesEx1;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		ClassesEx1 numeros = new ClassesEx1();
		System.out.println("Digite três números e descubra qual o maior: ");
		System.out.println();
		
		System.out.print("Digite o primeiro número: ");
		numeros.num1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		numeros.num2 = sc.nextInt();
		System.out.print("Digite o terceiro número: ");
		numeros.num3 = sc.nextInt();
		
		System.out.println();
		System.out.println(numeros);
		
		
		sc.close();

	}

}
