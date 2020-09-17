package entidades;

public class Terceiro extends Funcionario {

	private double horasAdicionais;

	public Terceiro(String nome, double horasAdicionais) {
		super(nome);
		this.horasAdicionais = horasAdicionais;
	}

	public Terceiro(String nome, double horasTrabalhadas, double valorPorHora, double horasAdicionais) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.horasAdicionais = horasAdicionais;
	}

	public double getHorasAdicionais() {
		return horasAdicionais;
	}

	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	
	@Override //puxadinho do metodo
	public double pagamento(double horasTrabalhadas, double valorPorHora) {
		
		return (super.pagamento(horasTrabalhadas, valorPorHora)) + (this.horasAdicionais * super.getValorPorHora()) ;

	}

}
