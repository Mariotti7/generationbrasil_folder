package Condition;

import java.util.Locale;
import java.util.Scanner;

import ClassesType.ClasseEx03;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
		 * 10-14 infantil
           15-17 juvenil
           18-25 adulto
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ClasseEx03 categoria = new ClasseEx03();
		System.out.println("------- DESCUBRA SUA CATEGORIA -------");
		System.out.println();
		
		System.out.print("Digite sua idade: ");
		categoria.age = sc.nextInt();
		System.out.println();
		
		System.out.println(categoria);

		
		sc.close();
	}

}
