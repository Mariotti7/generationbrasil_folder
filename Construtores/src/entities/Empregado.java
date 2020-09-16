package entities;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private double salarioBase;
	private double percImposto;

	public Empregado(String nomePessoa, String enderecoPessoa, String telPessoa, int codigoSetor, double salarioBase,
			double percImposto) {
		super(nomePessoa, enderecoPessoa, telPessoa);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.percImposto = percImposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getPercImposto() {
		return percImposto;
	}

	public void setPercImposto(double percImposto) {
		this.percImposto = percImposto;
	}
	
	public double calcularSalario(double salarioBase , double percImposto) {
		this.salarioBase = salarioBase;
		this.percImposto = percImposto;
		return salarioBase - (salarioBase * percImposto);
	}
}
