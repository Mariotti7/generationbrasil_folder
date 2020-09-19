package entidades;

public class ContaEspecial extends ContaCorrente{

	private double limit;
	
	//Construtores
	public ContaEspecial(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	public ContaEspecial(int numero, int talonario) {
		super(numero, talonario);
	}
	public ContaEspecial(int numero, int talonario, double limit) {
		super(numero, talonario);
		this.limit = limit;
	}
	
	//Metodos
	public double calculaJuros(double juros) {
		return getSaldo() * juros;
	}
	@Override
	public void emiteTalonario() {
		// TODO Auto-generated method stub
		super.emiteTalonario();
	}
	@Override
	public void emiteExtrato() {
		// TODO Auto-generated method stub
		super.emiteExtrato();
	}
	@Override
	public double credite(double credite) {
		// TODO Auto-generated method stub
		return super.credite(credite);
	}

	@Override
	public double debite(double debite) {
		// TODO Auto-generated method stub
		return super.debite(debite);
	}
	
	//Getters e Setters
	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return super.getNumero();
	}
	@Override
	public void setNumero(int numero) {
		// TODO Auto-generated method stub
		super.setNumero(numero);
	}
	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo();
	}
}