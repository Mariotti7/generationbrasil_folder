package entities;

import java.util.Locale;
import java.util.Scanner;

public class AlunoMedia {

	public static void main(String[] args) {
		/*
		 * Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
		 * Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Media media = new Media();
		System.out.println("--------- M�dia Alunos ---------");
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
