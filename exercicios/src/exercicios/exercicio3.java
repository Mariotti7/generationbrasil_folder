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
			System.out.println("Voc� tem idade para tirar habilita��o!");
		}else {
			System.out.println("Voc� n�o possui idade suficiente para tirar habilita��o");
		}
		
		System.out.println("Voc� digitou: " + idade);
		
		sc.close();
	}
}
