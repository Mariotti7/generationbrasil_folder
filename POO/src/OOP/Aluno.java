package OOP;

import java.util.Locale;
import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		NotaAluno aluno = new NotaAluno();
		
		System.out.print("Digite o seu nome: ");
		aluno.nome = sc.nextLine();
		System.out.print("Digite a primeira nota: ");
		aluno.nota1 = sc.nextInt();
		System.out.print("Digite a segunda nota: ");
		aluno.nota2 = sc.nextInt();
		System.out.print("Digite a terceira nota: ");
		aluno.nota3 = sc.nextInt();
		System.out.print("Digite a quarta nota: ");
		aluno.nota3 = sc.nextInt();
		System.out.print("Sexo: [M] Masculino ou [F] - Feminino: ");
		aluno.sexo = sc.next().toUpperCase().charAt(0);
		
		System.out.println();
		System.out.println(aluno);
		
		sc.close();

	}

}
