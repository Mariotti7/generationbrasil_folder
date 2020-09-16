package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("QUADRO FUNCIONARIOS");
		System.out.println();
		
		System.out.print("Digite o nome do funcionário: ");
		Funcionario.nomeFuncionario = sc.nextLine();
		System.out.print("Digite a matrícula: ");
		Funcionario.matriculaFuncionario = sc.next();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		Funcionario.horaTrabalhada = sc.nextDouble();
		System.out.print("Informe o valor $ da hora:  ");
		Funcionario.salarioFuncionario = sc.nextDouble();
		
		Funcionario.mostrar();
		Funcionario.horaTrabalho(Funcionario.horaTrabalhada);
		Funcionario.contaSalario(Funcionario.salarioFuncionario);
		
		
		sc.close();

	}

}
