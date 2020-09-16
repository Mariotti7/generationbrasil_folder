package entidades;

public class Disciplina {

	private String nomeDisciplina;

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	private int nivel;

	public Disciplina(String nomeDisciplina) {
		super();
		this.nomeDisciplina = nomeDisciplina;
	}

}
