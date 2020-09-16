package entities;

public class Operario extends Pessoa {

	private double valorProducao;
	private double comissao;

	public Operario(String nomePessoa, String enderecoPessoa, String telPessoa, double valorProducao, double comissao) {
		super(nomePessoa, enderecoPessoa, telPessoa);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularProducao(double valorProducao, double comissao) {
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		return valorProducao + (valorProducao * comissao);
	}

}
