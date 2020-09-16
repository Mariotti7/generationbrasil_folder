package entidades;

public class Pessoa {

	private String nome;
	private char sexo;
	private int anoNasc;
	private String etnia;

	public Pessoa(String nome) {
		
		this.nome = nome;
	}

	public Pessoa(String nome, int anoNasc) {
		this.nome = nome;
		this.anoNasc = anoNasc;
	}

	public Pessoa(String nome, int anoNasc, String etnia) {
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.etnia = etnia;
	}

	public Pessoa(String nome, int anoNasc, String etnia, char sexo) {
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.etnia = etnia;
		this.sexo = sexo;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public String getEtnia() {
		return etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

}
