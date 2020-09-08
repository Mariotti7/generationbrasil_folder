package entities;

import java.util.Locale;
import java.util.Scanner;

public class AlunoMedia {

	public static void main(String[] args) {
		/*
		 * Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Media media = new Media();
		System.out.println("--------- Média Alunos ---------");
		System.out.println();
		
		System.out.print("Informe a primeira nota: ");
		media.nota1 = sc.nextDouble();
		System.out.print("Informe a segunda nota: ");
		media.nota2 = sc.nextDouble();
		System.out.print("Informe a terceira nota: ");
		media.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(media);
		
		
		sc.close();
		
		
	}

}
