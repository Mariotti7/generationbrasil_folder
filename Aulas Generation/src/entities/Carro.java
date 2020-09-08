package entities;

public class Carro {
	
	public double custoDistribuidor = 0.28;
	public double custoImposto = 0.45;
	public double custoConsumidor;
	public double custoFabrica;
	
	public double valorDistribuidor(){
		return custoFabrica + (custoFabrica * custoDistribuidor);
	}
	
	public double valorImposto() {
		return custoFabrica + (custoFabrica * custoImposto);
	}
	
	public double custoConsumidor() {
		return custoFabrica + valorDistribuidor() + valorImposto();
	}
	
	public String toString() {
		return "O custo final de um carro para o consumidor é de R$ "
				+ String.format("%.2f",custoConsumidor());
		 
	}
}
