package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class ObjetoCliente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("RELATORIO CLIENTE");
		System.out.println();
		System.out.print("Informe o nome do cliente: ");
		Cliente.nomeCliente = sc.nextLine();
		System.out.print("Informe o número do pedido: ");
		Cliente.numeroPedido = sc.nextInt();
		System.out.print("Informe o status do pedido: ");
		Cliente.statusCliente = sc.nextLine();
		System.out.println();
		Cliente.mostrar();
		
		
		sc.close();
	}

}
