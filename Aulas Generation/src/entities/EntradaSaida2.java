package entities;

import java.util.Locale;
import java.util.Scanner;
import entities.Programacao2;

public class EntradaSaida2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 *Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
		 * */
		Programacao2 idade = new Programacao2();
		System.out.println("Informe sua idade em: ");
		System.out.println("---------------------");
		
		System.out.print("Dias: ");
		idade.days = sc.nextInt();
		
		System.out.println(idade);
			
		
		
		sc.close();

	}

}
