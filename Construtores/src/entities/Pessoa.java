package entities;

public class Pessoa {

	private String nomePessoa;
	private String enderecoPessoa;
	private String telPessoa;

	public Pessoa(String nomePessoa, String enderecoPessoa, String telPessoa) {
		super();
		this.nomePessoa = nomePessoa;
		this.enderecoPessoa = enderecoPessoa;
		this.telPessoa = telPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getEnderecoPessoa() {
		return enderecoPessoa;
	}

	public void setEnderecoPessoa(String enderecoPessoa) {
		this.enderecoPessoa = enderecoPessoa;
	}

	public String getTelPessoa() {
		return telPessoa;
	}

	public void setTelPessoa(String telPessoa) {
		this.telPessoa = telPessoa;
	}
	
	public String toString() {
		return "Nome: "
				+getNomePessoa()
				+"\n"
				+"Endereço: "
				+getEnderecoPessoa()
				+'\n'
				+"Contato: "
				+getTelPessoa();
	}

}
