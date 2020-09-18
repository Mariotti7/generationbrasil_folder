package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class Reino {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Animal> animais = new ArrayList<>();

		String nome, som, acao;
		int idade, n, escolha;

		System.out.println("BEM VINDO AO REINO ANIMAL");
		System.out.println("-------------------------");
		System.out.println("1- Cachorro | 2 - Cavalo | 3 - Preguiça");
		System.out.println();
		System.out.print("Quantos animais você quer? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o nome para o %dº animal: ", i + 1);
			nome = sc.next();
			System.out.print("Digite a idade do seu animal: ");
			idade = sc.nextInt();
			System.out.print("Que som seu animal faz: ");
			som = sc.next();
			System.out.print("Que habilidade ele tem: ");
			acao = sc.next();
			if (n == 1) {
				animais.add(new Cachorro(nome, idade, som, acao));
			} else if (n == 2) {
				animais.add(new Cavalo(nome, idade, som, acao));
			} else {
				animais.add(new Preguica(nome, idade, som, acao));
			}
		}
		System.out.println();
		System.out.println("OS ANIMAIS:");
		for (Animal animale : animais) {
			System.out.println("\nMe chamo: " + animale.getNome() + " | " + animale.emitirSom(animale.getSom()) + " | "
					+ animale.habilidade(animale.getAcao()));

			sc.close();

		}

	}
}
