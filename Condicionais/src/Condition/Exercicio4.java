package Condition;

import java.util.Locale;
import java.util.Scanner;

import ClassesType.ClasseEx04;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
		 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------ Descubra se o n�mero � par ou �mpar ------");
		System.out.println();
		
		ClasseEx04 numero = new ClasseEx04();
		System.out.print("Digite um n�mero: ");
		numero.numero = sc.nextInt();
		
		System.out.println();
		System.out.println(numero);
		
		
		sc.close();
	}

}
