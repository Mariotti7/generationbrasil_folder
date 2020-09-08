package entities;

public class Formula {
	
	public double D;
	public double X1;
	public double X2;
	public double Y1;
	public double Y2;
	
	public double D() {
		return Math.sqrt(Math.pow((X2 - X1),2) + Math.pow((Y2 - Y1),2));
	}
	
	public String toString() {
		return "A distancia entre os dois pontos é: "
				+ String.format("%.2f", D());
	}
	
}
