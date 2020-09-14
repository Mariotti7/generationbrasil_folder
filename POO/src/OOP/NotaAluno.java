package OOP;

public class NotaAluno {
	
	public String nome;
	public int nota1;
	public int nota2;
	public int nota3;
	public int nota4;
	public boolean feminino;
	public char sexo;
	
	public double Media() {
		return (nota1+nota2+nota3+nota4)/4;
	}
	
	public boolean Sexo() {
		if(sexo == 'F') {
			return feminino = true;
		}else {
			return feminino = false;
		}
	}
	
	public String toString() {
		return "Nome: " + nome + " | nota 1:  " + nota1 + " | nota 2:  " + nota2 + " | nota 3:  " + nota3 + " | nota 4:  " 
				+ nota4 + " | MEDIA: " + Media() + "| Sexo Aluno: " + Sexo(); 
	}
}
