package application;

import java.util.Locale;
import java.util.Scanner;

import entities.aviao;

public class ObjetoAviao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ESCALA DE AERONAVES");
		System.out.println();
		
		System.out.print("Informe o nome da aeronave: ");
		aviao.nomeAviao = sc.nextLine().toUpperCase();
		System.out.print("Informe a rota: ");
		aviao.rotaAviao = sc.next().toUpperCase();
		System.out.print("Informe a velocidade: ");
		aviao.velocidade = sc.nextDouble();
		System.out.println();
		
		aviao.mostrar();
		aviao.decolar(aviao.velocidade);
		
		
		sc.close();
	}

}
