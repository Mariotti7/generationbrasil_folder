package entidades;

public class ContaCorrente extends ContaBancaria{

	private int talonario;
	
	//Construtores
	
	public ContaCorrente(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	public ContaCorrente(int numero, int talonario) {
		super(numero);
		this.talonario = talonario;
	}
	

	//Metodos
	
	public void emiteTalonario(){
		
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