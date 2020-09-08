package entities;

public class MathExpression {
	
	public double D;
	public double R;
	public double S;
	public double A;
	public double B;
	public double C;
	
	
	public double D() {
		return (R() + S()) / 2;
	}
	
	public double R() {
		return Math.pow(A + B, 2);
	}
	
	public double S() {
		return Math.pow(B + C, 2);
	}
	
	public String toString() {
		return "O calculo para expressão D = (R + S) é: "
				+ String.format("%.2f", D());
	}
	
}
