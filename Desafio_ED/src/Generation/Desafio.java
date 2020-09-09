package Generation;

import java.util.Locale;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		/*
		 * DESAFIO JAVA - FAZER UM PROGRAMA QUE LEIA DUAS VARIAVEIS INTEIRAS SIMPLES E 
		 * INVERTA OS VALORES DAS VARIAVEIS NO SEU CONTEUDO E EXIBA O RESULTADO:
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Classe invertido = new Classe();
		System.out.print("Insira valor de X: ");
		invertido.X = sc.nextInt();
		System.out.print("Insira valor de Y: ");
		invertido.Y = sc.nextInt();
		invertido.Z = invertido.X;
		
		System.out.println();
		System.out.println(invertido);
		sc.close();
		
	}

}
