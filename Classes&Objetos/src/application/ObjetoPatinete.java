package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Patinete;

public class ObjetoPatinete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("LOJA PATINETE MANEIRO");
		System.out.println();
		
		System.out.print("Busque um patinete: ");
		Patinete.marcaPatinete = sc.nextLine().toUpperCase();
		System.out.print("Informe o pre�o da tabela: ");
		Patinete.precoPatinete = sc.nextDouble();
		System.out.print("Deseja acess�rio Turbo? Digite: SIM ou NAO  ");
		Patinete.acessorioTurbo = sc.next();
		System.out.print("Valor 100.00 por acessorio ou 0.00 caso n�o tenha escolhido: ");
		double acessorio = sc.nextDouble();
		Patinete.addPrecoAcessorio(acessorio);
		
		Patinete.mostrar();
		Patinete.precoAcessorio(Patinete.acessorioTurbo);
		
		sc.close();
	}

}
