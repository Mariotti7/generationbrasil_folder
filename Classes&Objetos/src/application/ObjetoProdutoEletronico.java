package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoEletronico;

public class ObjetoProdutoEletronico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ProdutoEletronico eletronic = new ProdutoEletronico();
		
		System.out.println("LOJA 100 FRESCURA DIGITAL");
		System.out.println();
		System.out.print("Busque o seu produto: ");
		ProdutoEletronico.nomeProduto = sc.nextLine().toUpperCase();
		System.out.print("Digite o preço da loja: ");
		ProdutoEletronico.precoProduto = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		ProdutoEletronico.estoqueProduto = sc.nextDouble();
		System.out.print("Retirada em estoque: ");
		double estoqueProduto = sc.nextDouble();
		eletronic.produtoEstoque(estoqueProduto);
		
		System.out.println();
		ProdutoEletronico.mostra();
		ProdutoEletronico.promocao(0);
		
		
		
		
		sc.close();

	}

}
