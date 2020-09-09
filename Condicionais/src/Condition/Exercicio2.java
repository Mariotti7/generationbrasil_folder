package Condition;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		int num1;
		int num2;
		int num3;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------- NUMEROS EM ORDEM CRESCENTE ---------");
		System.out.println();
		System.out.println("Digite tr�s n�meros inteiros: ");
		System.out.println();
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = sc.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		num3 = sc.nextInt();
		
		System.out.println();
		if((num1 > num2) && (num1 > num3)) {
			System.out.println(num3 + ", " + num2 + ", " + num1);
			
		}else if((num2 > num3) && (num3 > num1)) {
			System.out.println(num1 + ", " + num3 + ", " + num2);
			 
		}else if((num3 > num1) && (num1 > num2)) {
			System.out.println(num3 + ", " + num1 + ", " + num2);
		}else if(((num3 == num1) && (num1 > num2))) {
			System.out.println(num2 + ", " + num1 + ", " + num3);
			
		} else if(((num3 < num1) && (num1 == num2))) {
			System.out.println(num3 + ", " + num2 + ", " + num1);
			
		}else {
				System.out.println(num1 + ", " + num2 + ", " + num3);
		}
		
		
		
		sc.close();
	}

}
