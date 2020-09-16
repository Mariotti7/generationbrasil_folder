package entities;

public class Fornecedor extends Pessoa {

	private double valorCredito;
	private double valorDivida;

	public Fornecedor(String nomePessoa, String enderecoPessoa, String telPessoa, double valorCredito,
			double valorDivida) {
		super(nomePessoa, enderecoPessoa, telPessoa);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo(double valorCredito, double valorDivida) {
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
			return valorCredito - valorDivida;
	}
}
