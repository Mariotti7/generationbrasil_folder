package generationPack;

import java.util.Locale;
import java.util.Scanner;

public class generationClass {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String mensagem;
		
		System.out.println("Hello World!!");
		System.out.println("Digite uma mensagem: ");
		mensagem = sc.next();
		System.out.println("Você digitou: " + mensagem);
		
		sc.close();

	}

}
