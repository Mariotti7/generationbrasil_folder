package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceiro;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		char ch;
		String nome;
		int hora = 0;
		double valorHora = 0;
		double valorExtra = 0;

		List<Funcionario> lista = new ArrayList<>();//Utilizando o List 

		System.out.print("Digite o número de funcionários: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Nome do funcionario " + i + ":");
			System.out.print("Terceiro [S/N]");
			ch = sc.next().toUpperCase().charAt(0);
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Horas trabalhadas: ");
			hora = sc.nextInt();
			System.out.print("Valor da hora: ");
			valorHora = sc.nextDouble();
			if (ch == 'S') {
				System.out.print("Digite o valor hora adicional: ");
				valorExtra = sc.nextDouble();
				lista.add(new Terceiro(nome, hora, valorHora, valorExtra));//adicionando os itens da lista
			} else {

				lista.add(new Funcionario(nome, hora, valorHora));

			}

		}
		System.out.println();
		System.out.println("PAGAMENTOS");
		for (Funcionario func : lista) {//For each para listar as informações
			System.out.println("Nome: " + func.getNome() + " | Pagamento: " + func.pagamento(hora, valorHora));
		}

		sc.close();

	}

}
