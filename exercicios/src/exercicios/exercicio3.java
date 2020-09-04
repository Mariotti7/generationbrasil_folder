package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		
		if(idade >= 18) {
			System.out.println("Você tem idade para tirar habilitação!");
		}else {
			System.out.println("Você não possui idade suficiente para tirar habilitação");
		}
		
		System.out.println("Você digitou: " + idade);
		
		sc.close();
	}
}
