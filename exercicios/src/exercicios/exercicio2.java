package exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// "Ola. Meu nome é <nome>, sou natural de <cidade>, tenho <idade> anos e estou aprendendo a programar."
		
		Scanner sc = new Scanner (System.in);
			
		System.out.println("Digite o seu nome:");
		String nome = sc.next();
		
		System.out.println("Digite sua cidade:");
		String cidade = sc.next();
		
		System.out.println("Digite a sua idade:");
		String idade = sc.next();
		
		System.out.printf("Ola. Meu nome é %s, sou natural de %s, tenho %s anos e estou aprendendo a programar.", nome, cidade, idade);
		
		
		sc.close();

	}

}
