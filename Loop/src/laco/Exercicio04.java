package laco;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
		 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), e as op��es 
		 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		 * 
		 *  o n�mero de pessoas calmas; 
			o n�mero de mulheres nervosas; 
			o n�mero de homens agressivos; 
			o n�mero de pessoas nervosas com mais de 40 anos; 
			o n�mero de pessoas calmas com menos de 18 anos.
		 * */
		
		int age, gender, psy, i = 0, calm = 0, nervous = 0, agressive = 0, older = 0, younger = 0;
		
		System.out.println("---- PESQUISA PERFIL PSICOLOGICO ----");
		System.out.println();
		
			while(i < 150) {
				System.out.print("Pessoa n�mero: ");
				i = sc.nextInt();
				System.out.print("Informe sua idade: ");
				age = sc.nextInt();
				System.out.print(" 1 para FEMININO ou 2 para MASCULINO: ");
				gender = sc.nextInt();
				System.out.print(" 1 para CALMO ou 2 para NERVOSA ou 3 para AGRESSIVA: ");
				psy = sc.nextInt();
				System.out.println();
				if(gender == 1) {
					//System.out.println("FEMININO");
				}else if(gender == 2) {
					//System.out.println("MASCULINO");
				}else {
					System.out.println("OP��O INVALIDA");
				}
				if(psy == 1) {
					//System.out.println("CALMA");
					calm++;
					if(psy == 1 && age < 18 ) {
						younger++;
					}
				}else if(psy == 2) {
					//System.out.println("NERVOSA");
					nervous++;
					if(psy == 2 && age > 40) {
						older++;
					}
				}else if(psy == 3) {
					//System.out.println("AGRESSIVA");
					agressive++;
				}else {
					System.out.println("OP��O INVALIDA");
				}
				
			}i++;
		System.out.println();
		System.out.println("Numero de pessoas calmas: " + calm
				+"\n"
				+"Numero de pessoas nervosas " + nervous
				+"\n"
				+"Numero de pessoas agressivas " + agressive
				+"\n"
				+"Numero de pessoas nervosas com mais de 40 anos: " + older
				+"\n"
				+"Numero de pessoas calmas com menos de 18 anos: " + younger
);
		
		
		sc.close();
	}

}
