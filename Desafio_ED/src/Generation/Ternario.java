package Generation;

import java.util.Locale;
import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		// Escolhendo o genero
		
		int gender;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("--- Digite 1 se MASCULINO, 2 se FEMININO ou 3 se OUTRO ---");
		System.out.println();
		System.out.print("Digite um número: ");
		gender = sc.nextInt();
		
		System.out.println();
		System.out.println(gender == 1 ? "MASCULINO": gender == 2? "FEMININO" : gender == 3 ? "OUTRO": "INVALIDO");
		
		
		
		sc.close();
	}

}
