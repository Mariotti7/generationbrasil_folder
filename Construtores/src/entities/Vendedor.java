package entities;

public class Vendedor extends Pessoa {
	private double valorVendas;
	private double comissaoVendedor;

	public Vendedor(String nomePessoa, String enderecoPessoa, String telPessoa, double valorVendas,
			double comissaoVendedor) {
		super(nomePessoa, enderecoPessoa, telPessoa);
		this.valorVendas = valorVendas;
		this.comissaoVendedor = comissaoVendedor;
	}

	public double getComissaoVendedor() {
		return comissaoVendedor;
	}

	public void setComissaoVendedor(double comissaoVendedor) {
		this.comissaoVendedor = comissaoVendedor;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double calcularVendas(double valorVendas, double comissaoVendedor) {
		this.valorVendas = valorVendas;
		this.comissaoVendedor = comissaoVendedor;
		return valorVendas + (valorVendas * comissaoVendedor);
	}

}
