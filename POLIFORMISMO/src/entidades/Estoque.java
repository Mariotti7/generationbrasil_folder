package entidades;

public class Estoque {

	private double whey;

	public Estoque() {

	}

	public Estoque(double whey) {
		super();
		this.whey = whey;

	}

	public double getWhey() {
		return whey;
	}

	public void setWhey(double whey) {
		this.whey = whey;
	}

	public void addEstoque(double whey) {
		this.whey += whey;

	}

	public void outEstoque(double whey) {
		this.whey -= whey;

	}
	
	public String toString() {
		return "Estoque: " + getWhey();
	}
}
