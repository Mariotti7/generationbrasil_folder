package laco;

import java.util.Locale;


public class Exercicio01 {

	public static void main(String[] args) {
		// Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		Locale.setDefault(Locale.US);
	
		for(int i = 1000; i < 2000 ; i++) {
			if((i % 11) == 5 ) {
				System.out.println("Números: " + i);
			}
		}

	}

}
