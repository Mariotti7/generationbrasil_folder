package entities;

public class Media {
	
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double media() {
		return (nota1 * 2) + (nota2 * 3) + (nota3 * 5) / 10;
	}
	
	public String toString() {
		return "A m�dia final do aluno �: "
				+ media();
	}
	
}
