package Generation;

public class Classe {
	
	public int X;
	public int Y;
	public int Z;
	
	public int inverteZ() {
		return Z = X;
	}
	
	public int inverteX() {
		return X = Y;
	}
	
	public int inverteY() {
		return Y = Z;
	}
	
	public String toString() {
		return "Valor de X agora é: "
				+ inverteX()
				+"\n"
				+"Valor de Y agora é: "
				+ inverteY();
	}
}
