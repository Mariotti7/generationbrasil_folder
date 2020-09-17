package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceiro;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("INFORMAÇÕES FUNCIONÁRIOS");
		System.out.println();

		Funcionario funcionario = new Funcionario("Joao Silva");
		Terceiro terceiro = new Terceiro("Maria Moreira", 0);

		funcionario.setHorasTrabalhadas(40);
		funcionario.setValorPorHora(60);
		terceiro.setHorasTrabalhadas(40);
		terceiro.setValorPorHora(60);
		terceiro.setHorasAdicionais(2);

		System.out.printf("Funcionário: %s%n", funcionario.getNome());
		System.out.printf("Pagamento: R$ %.2f%n"
				,funcionario.pagamento(funcionario.getHorasTrabalhadas(), funcionario.getValorPorHora()));
		System.out.printf("\nFuncionário: %s%n", terceiro.getNome());
		System.out.printf("Pagamento(com horas extras): R$ %.2f%n ",
				terceiro.pagamento(terceiro.getHorasTrabalhadas(), terceiro.getValorPorHora()));
		sc.close();

	}

}
