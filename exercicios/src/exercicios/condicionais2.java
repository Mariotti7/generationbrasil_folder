package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class condicionais2 {

	public static void main(String[] args) {
		/*
		 *  Elabore um sistema que leia as variáveis C e N, respectivamente código e
			número de horas trabalhadas de um operário. E calcule o salário sabendo-se que
			ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o
			excesso de pagamento armazenando-o na variável E, caso contrário zerar tal
			variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento
			imprimir o salário total e o salário excedente.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String C;
		int N;
		double salario, E, salarioTotal, valorExcedente, salarioHora;
		
		System.out.println("Informe seu código de operário: ");
		C = sc.next();
		System.out.println("-----------------------------------");
		System.out.println("Informe as horas trabalhadas: ");
		N = sc.nextInt();
		System.out.println("-----------------------------------");
		if(N > 50) {
			E = N - 50;
			valorExcedente = 20.0;
			salario = 500.0;
			salarioTotal = salario + (E * valorExcedente);
			System.out.println("------------------------");
			System.out.printf("Código Operario: %s%n ------ Salario: R$ %.2f%n -------- Hora Extra: %.2f%n ------ Salario Total: R$ %.2f%n ", C, salario, E, salarioTotal);
		}else {
			E = 0;
			valorExcedente = 0;
			salarioHora = 10.0;
			salario = N * salarioHora;
			salarioTotal = salario + (E * valorExcedente);
			System.out.println("------------------------");
			System.out.printf("Código Operario: %s%n ------ Salario: R$ %.2f%n -------- Hora Extra: %.2f%n ------ Salario Total: R$ %.2f%n ", C, salario, E, salarioTotal);
		}
		sc.close();
	}

}
