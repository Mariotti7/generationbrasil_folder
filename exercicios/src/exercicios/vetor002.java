package exercicios;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class vetor002 {

	public static void main(String[] args) {
		/*
		 * Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui.
		 * 
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Random aleatorio = new Random();
		
		int[] vetor = new int[40];
		int pares = 0;
		int totalPares = 0;
		
		for(int i = 0; i < vetor.length ; i++) {
			int numero = aleatorio.nextInt(20);//Escolhendo numeros aleatorios até 20
			
			System.out.println(numero);
			System.out.println(" ");
			totalPares = totalPares + vetor[i];
			if((vetor[i]%2) == 0) {//Achando os pares???????
				//pares = vetor[i]; 
				pares++;
			}
			
			if(totalPares < pares) {//Contabilizando os pares??????
				totalPares = totalPares + pares;
			}
		}
		System.out.println("Pares: " + totalPares);
		
		sc.close();

	}

}
