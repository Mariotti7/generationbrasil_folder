package exercicios;

import java.util.Scanner;

public class exercicios {


	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade:");
		int suaIdade = sc.nextInt();
		
		System.out.println("Digite a idade da sua mãe:");
		int idadeMae = sc.nextInt();
		
		int diff = idadeMae - suaIdade;
		
		System.out.printf("Sua mãe é %d anos mais velha que você.",diff);
	
		sc.close();
	}

}
