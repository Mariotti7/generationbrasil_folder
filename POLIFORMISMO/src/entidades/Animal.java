package entidades;

public class Animal {
	// atributos
	private String nome;
	private int idade;
	private String som;
	private String acao;

	// construtores

	public Animal() {
		super();
	}

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	

	public Animal(String nome, int idade, String som, String acao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.acao = acao;
	}

	// segurança

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

	// metodos
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String emitirSom(String som) {
		this.som = som;
		return "Eu faço o som assim: " + som;
	}
	
	public String habilidade(String acao) {
		this.acao = acao;
		return "Eu costumo " + acao;
	}
}
