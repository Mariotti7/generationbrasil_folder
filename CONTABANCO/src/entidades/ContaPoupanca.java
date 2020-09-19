package entidades;

public class ContaPoupanca extends ContaBancaria{

	private double juros;
	private double corrMonetaria;
	private int mesAniversario;
	
	
	//Construtores
	public ContaPoupanca(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	public ContaPoupanca(int numero, double juros, double corrMonetaria, int mesAniversario) {
		super(numero);
		this.juros = juros;
		this.corrMonetaria = corrMonetaria;
		this.mesAniversario = mesAniversario;
	}
	
	//Metodos
	
	public void aniversarioMes() {
		
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
}
