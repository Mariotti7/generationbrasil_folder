package entidades;

public class Cachorro extends Animal {

	private String som;
	private String acao;

	public Cachorro() {

	}


	public Cachorro(String nome, int idade, String som, String acao) {
		super(nome, idade);
		this.som = som;
		this.acao = acao;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getAcao() {
		return acao;
	}

	public void setHabilidade(String acao) {
		this.acao = acao;
	}

	@Override
	public String emitirSom(String som) {
		this.som = som;
		return super.emitirSom(som);
	}

	@Override
	public String habilidade(String acao) {
		this.acao = acao;
		return super.habilidade(acao);
	}

}
