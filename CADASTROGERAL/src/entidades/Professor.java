package entidades;

public class Professor extends Pessoa {

	private String materiaLecionada;

	public Professor(String nome, String materiaLecionada) {
		super(nome);
		this.materiaLecionada = materiaLecionada;
	}

	public String getMateriaLecionada() {
		return materiaLecionada;
	}

	public void setMateriaLecionada(String materiaLecionada) {
		this.materiaLecionada = materiaLecionada;
	}

}
