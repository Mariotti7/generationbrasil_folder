package entities;

public class ProdutoEletronico {
	//atributos
	public static String nomeProduto;
	public static double precoProduto;
	public static double estoqueProduto;
	
	//metodos
	public static void mostra() {
		System.out.printf("\nProduto: %s%n", ProdutoEletronico.nomeProduto);
		System.out.printf("Preço: %.2f%n", ProdutoEletronico.precoProduto);
		System.out.printf("Estoque: %.2f%n", ProdutoEletronico.estoqueProduto);
		
	}

	public static double getPrecoProduto() {
		return precoProduto;
	}

	public static void setPrecoProduto(double precoProduto) {
		ProdutoEletronico.precoProduto = precoProduto;
	}
	
	public static double promocao(double precoProduto) {
		if(ProdutoEletronico.precoProduto > 2000.00) {
			System.out.println("\n10% DE DESCONTO");
		}else if(ProdutoEletronico.precoProduto == 1500.00){
			System.out.println("\n5% DE DESCONTO");
		}else {
			System.out.println("\nNÃO TEM PROMOÇÃO");
		}
		return precoProduto = precoProduto * 0.10;
	}
	
	public void produtoEstoque(double estoqueProduto) {
		ProdutoEletronico.estoqueProduto -= estoqueProduto;
	}
	
	
}
