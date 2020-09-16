package entities;

public class aviao {
	//atributo
	public static String nomeAviao;
	public static String rotaAviao;
	public static double velocidade;
	
	//metodo
	public static void mostrar() {
		System.out.printf("\nAERONAVE: %s%n",aviao.nomeAviao);
		System.out.printf("Rota: %s%n",aviao.rotaAviao);
	}

	public static double getVelocidade() {
		return velocidade;
	}

	public static double setVelocidade(double velocidade) {
		return aviao.velocidade = velocidade;
	}
	
	public static double decolar(double velocidade) {
		if(velocidade > 100) {
			System.out.println("Staus: DECOLANDO");
		}else {
			System.out.println("Status: NÃO ESTÁ PRONTO");
		}
		return aviao.setVelocidade(velocidade);
	}
}
