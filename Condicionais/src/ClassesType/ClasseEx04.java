package ClassesType;

public class ClasseEx04 {
	public int numero;
	
	public double numPar() {
		if((numero % 2) == 0) {
			System.out.print("NUMERO PAR: Sua Raiz quadrada �:");
			return Math.sqrt(numero);
		}else {
			System.out.print("NUMERO IMPAR: Elevado ao quadrado �:");
			return Math.pow(numero, 2.0);
		}
	}
	
	public String toString() {
		return " " 
				+ String.format("%.2f",numPar());
	}
}
