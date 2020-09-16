package entities;

public class Administrador extends Pessoa {

	private double ajudaDeCusto;

	public Administrador(String nomePessoa, String enderecoPessoa, String telPessoa, double ajudaDeCusto) {
		super(nomePessoa, enderecoPessoa, telPessoa);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

}
