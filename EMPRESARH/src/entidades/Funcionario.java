package entidades;

public class Funcionario {

	// atributo
	private String nome;
	private double horasTrabalhadas; // no metodo pagamento da erro ao deixar como int
	private double valorPorHora;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public Funcionario(String nome, double horasTrabalhadas, double valorPorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	// metodo

	public double pagamento(double horasTrabalhadas, double valorPorHora) {
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
		return (horasTrabalhadas * valorPorHora);

	}

}
