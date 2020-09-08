package entities;

public class FormulaEquacao {

	public double a;
	public double b;
	public double c;
	public double d;
	public double e;
	public double f;

	
	public double x() {
		return ((c * e) - (b - f) / (a * e) - (b - d)); 
	}
	
	public double y() {
		return ((a * f) - (c - d) / (a * e) - (b - d)); 
	}
	
	public String toString() {
		return "O valor de X é: "
				+ String.format("%.2f", x())
				+"\n"
				+"O valor de Y é: "
				+String.format("%.2f", y())
				;
	}
}
