package application;

import java.util.Locale;

import entities.Administrador;
import entities.Empregado;
import entities.Fornecedor;
import entities.Operario;
import entities.Pessoa;
import entities.Vendedor;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Pessoa pessoaTeste = new Pessoa("Bruce Wayne", "Wayne Mansion", "555-batman");
		Fornecedor fornecedorTeste = new Fornecedor("Empresas Wayne", "Gothan City", "555-323", 1500000.00, 1000000.00);
		Empregado empregadoTeste = new Empregado("Jason Todd", "Wayne Mansion Boulevard", "555-robin", 191, 20000.00,
				0.15);
		Administrador admTeste = new Administrador("Thomas Wayne", "Wayne Mansion", "555-beco", 50000.00);
		Operario operarioTeste = new Operario("Arthur Fleck", "Arkhan", "555-joker", 100.0, 0.10);
		Vendedor vendedorTeste = new Vendedor("Gordon", "Gothan City", "911", 1000.0, 0.20);

		System.out.println(pessoaTeste.getNomePessoa());
		System.out.println(
				fornecedorTeste.obterSaldo(fornecedorTeste.getValorCredito(), fornecedorTeste.getValorDivida()));
		System.out.println(
				empregadoTeste.calcularSalario(empregadoTeste.getSalarioBase(), empregadoTeste.getPercImposto()));
		System.out.println(admTeste.getEnderecoPessoa());
		System.out
				.println(operarioTeste.calcularProducao(operarioTeste.getValorProducao(), operarioTeste.getComissao()));
		System.out.println(
				vendedorTeste.calcularVendas(vendedorTeste.getValorVendas(), vendedorTeste.getComissaoVendedor()));
	}

}
