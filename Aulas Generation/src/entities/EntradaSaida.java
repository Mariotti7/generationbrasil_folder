package entities;

import java.util.Locale;
import java.util.Scanner;
import entities.Programacao;

public class EntradaSaida {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 *  Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e 
		 *  mostre-a expressa apenas em dias. 
		 * */
		
		Programacao idade = new Programacao();
		System.out.println("Informe sua idade em: ");
		System.out.println("---------------------");
		
		System.out.print("Anos: ");
		idade.year = sc.nextInt();
		
		System.out.print("Meses: ");
		idade.mounth = sc.nextInt();
		
		System.out.print("Dias: ");
		idade.day = sc.nextInt();
		
		System.out.println();
		System.out.println(idade);
		
		
		
		sc.close();

	}

}
