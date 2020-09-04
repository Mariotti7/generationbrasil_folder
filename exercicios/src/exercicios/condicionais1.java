package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class condicionais1 {

	public static void main(String[] args) {
		/*
		 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para
			controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
			tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50
			quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que
			você faça um sistema que leia a variável P (peso de tomates) e verifique se há
			excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da
			multa que João deverá pagar. Caso contrário mostrar tais variáveis com o
			conteúdo ZERO.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			int P, E;
			double M;
			
			System.out.println("Digite o peso do Tomate (Kg): ");
			P = sc.nextInt();
			System.out.println("-------------------------");
			if(P > 50) {
				E = P - 50;
				M = E * 4.0;
				System.out.printf("Tomate: %dKg | Excendente: %d Kg | Multa: R$ %.2f%n", P, E, M);
			}else {
				E = 0;
				M = 0.0;
				System.out.println("Peso do Tomate dentro do acordado pelo Regulamento do Estado de São Paulo.");
			}
		
		sc.close();

	}

}
