package Condition;

import java.util.Locale;
import java.util.Scanner;

import ClassesType.ClassesEx1;

public class Exercicio1 {

	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		ClassesEx1 numeros = new ClassesEx1();
		System.out.println("Digite tr�s n�meros e descubra qual o maior: ");
		System.out.println();
		
		System.out.print("Digite o primeiro n�mero: ");
		numeros.num1 = sc.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		numeros.num2 = sc.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		numeros.num3 = sc.nextInt();
		
		System.out.println();
		System.out.println(numeros);
		
		
		sc.close();

	}

}
