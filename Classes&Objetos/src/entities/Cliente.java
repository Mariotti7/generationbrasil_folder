package entities;

public class Cliente {

	//atributos
	
	public static String nomeCliente;
	public static int numeroPedido;
	public static String statusCliente;
	
	//metodos
	
	public static void mostrar() {
		System.out.printf("\nCliente: %s%n", Cliente.nomeCliente);
		System.out.printf("Número do Pedido: %d%n", Cliente.numeroPedido);
		if(Cliente.numeroPedido > 10) {
			System.out.print("Status do Pedido: AGUARDANDO");
		}else {
			System.out.print("Status do Pedido: ENTREGUE");
		}
	}
	
	

	
	
}
