package aplicacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Scanner;

import entidades.Estoque;

public class Loja {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int suplemento;
		double estoqueInicial;

		Collection<String> produtos = new ArrayList<String>();

		produtos.add("OPTIMUM");
		produtos.add("GROWTH");

		System.out.println("DOUBLE BICEPS STORE");
		System.out.println("-------------------");
		System.out.println();

		System.out.print("Quantidade no estoque: ");
		estoqueInicial = sc.nextDouble();
		Estoque quantidade = new Estoque(estoqueInicial);
		System.out.println("\nSelecione o whey da lista abaixo: ");
		for (String paradinha : produtos) {
			System.out.println("Whey: " + paradinha);
			System.out.println("TOTAL: " + estoqueInicial);
		}
		System.out.print("\nEscolha [1]Optimum ou [2]Growth: ");
		suplemento = sc.nextInt();
		System.out.print("\nQuantidade de saída: ");
		double outEstoque = sc.nextDouble();
		quantidade.outEstoque(outEstoque);
		System.out.println(quantidade);
		if (suplemento == 1) {
			produtos.remove("OPTIMUM");
			System.out.println("\nTem Whey Optimum no estoque? " + produtos.contains("OPTIMUM"));
			for (String paradinha : produtos) {
				System.out.println("Produto restante Whey: " + paradinha);
				System.out.print("\nAdicione ao estoque Whey Optimum: ");
				double addEstoque = sc.nextDouble();
				quantidade.addEstoque(addEstoque);
				System.out.println(quantidade);
			}
		} else {
			produtos.remove("GROWTH");
			System.out.println("\nTem Whey Growth no estoque? " + produtos.contains("GROWTH"));
			for (String paradinha : produtos) {
				System.out.println("Produto restante Whey: " + paradinha);
				System.out.print("\nAdicione ao estoque Whey Growth: ");
				double addEstoque = sc.nextDouble();
				quantidade.addEstoque(addEstoque);
				System.out.println(quantidade);
			}
		}
		System.out.println();
		System.out.println("--------- NO PAIN NO GAIN ---------");

		sc.close();
	}

}
