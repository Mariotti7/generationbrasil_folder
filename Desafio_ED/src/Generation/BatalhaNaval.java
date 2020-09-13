package Generation;

import java.util.Locale;	
import java.util.Scanner;

public class BatalhaNaval {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		String[][] grelhaDefesa = new String[4][4];
		String[][] grelhaExemplo = new String[4][4];
		String portaAvioes, navio4Canos, navio3Canos, navio2Canos, navio1Cano;
		int tiro;
	
		System.out.println("BATALHA NAVAL");
		System.out.println();
		
		grelhaDefesa[0][0] = "~";
		grelhaDefesa[0][1] = "~";				
		grelhaDefesa[0][2] = "P";
		grelhaDefesa[0][3] = "~";
		grelhaDefesa[1][0] = "N1";
		grelhaDefesa[1][1] = "~";
		grelhaDefesa[1][2] = "~";
		grelhaDefesa[1][3] = "N2";
		grelhaDefesa[2][0] = "~";
		grelhaDefesa[2][1] = "~";
		grelhaDefesa[2][2] = "~";		
		grelhaDefesa[2][3] = "N3";
		grelhaDefesa[3][0] = "~";
		grelhaDefesa[3][1] = "~";
		grelhaDefesa[3][2] = "~";
		grelhaDefesa[3][3] = "N4";
		
		grelhaExemplo[0][0] = "00";
		grelhaExemplo[0][1] = "01";				
		grelhaExemplo[0][2] = "02";
		grelhaExemplo[0][3] = "03";
		grelhaExemplo[1][0] = "10";
		grelhaExemplo[1][1] = "11";
		grelhaExemplo[1][2] = "12";
		grelhaExemplo[1][3] = "13";
		grelhaExemplo[2][0] = "20";
		grelhaExemplo[2][1] = "21";
		grelhaExemplo[2][2] = "22";		
		grelhaExemplo[2][3] = "23";
		grelhaExemplo[3][0] = "30";
		grelhaExemplo[3][1] = "31";
		grelhaExemplo[3][2] = "32";
		grelhaExemplo[3][3] = "33";
		
		System.out.println();
		System.out.println("INTRUÇÕES DO JOGO: ");
		System.out.println("Dê até 04 tiros indicando uma posição (por exemplo 21).");
		System.out.println("O primeiro número é a linha e o segundo é a coluna.");
		System.out.println("Ao digitar as coordenadas o sistema vai informar se ACERTOU ou se ERROU o tiro.");
		System.out.println("Ao final o tabuleiro vai mostrar as posições, D de navio DESTRUIDO ou X de TIRO NA ÁGUA");
		System.out.println();
		System.out.println("TABULEIRO DE EXEMPLO");
		System.out.println();;
		for(int linha = 0; linha < 4 ; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				
				System.out.printf("\t %s \t", grelhaExemplo[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Que os jogos comecem...");
		System.out.println();
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna<4; coluna++){
					System.out.println();
					System.out.printf("Dê o %dº tiro: ", linha+1, coluna+1);//
					tiro = sc.nextInt();//Encontrar uma maneira de nao repetir o mesmo numero
					System.out.println();
						if(tiro == 02 ) {
							System.out.println("KABUM");
							portaAvioes = "AFUNDOU";
							System.out.println(portaAvioes);
							grelhaDefesa[0][2] = "D";
							break;
						}
						if(tiro == 10) {
							System.out.println("KABUM");
							navio1Cano = "AFUNDOU";
							System.out.println(navio1Cano);
							grelhaDefesa[1][0] = "D";
							break;
						}		
						if(tiro == 13) {
							System.out.println("KABUM");
							navio2Canos = "AFUNDOU";
							System.out.println(navio2Canos);
							grelhaDefesa[1][3] = "D";
							break;
						}
						if(tiro == 23) {
							System.out.println("KABUM");
							navio3Canos = "AFUNDOU";
							System.out.println(navio3Canos);
							grelhaDefesa[2][3] = "D";
							break;
						}
						if(tiro == 33) {
							System.out.println("KABUM");
							navio4Canos = "AFUNDOU";
							System.out.println(navio4Canos);
							grelhaDefesa[3][3] = "D";
							break;
						}else{
					System.out.println("TIRO NA AGUA");
					grelhaDefesa[linha][coluna] = "X";//Encontrar uma maneira de marcar um X no lugar certo
					break;
						}
				} 
			}
		System.out.println();
		System.out.println("FIM DE JOGO");
		System.out.println();
		System.out.println("TABULEIRO BATALHA NAVAL");
		System.out.println();;
			for(int linha = 0; linha < 4 ; linha++) {
				for(int coluna = 0; coluna < 4; coluna++) {
					System.out.printf("\t %s \t", grelhaDefesa[linha][coluna]);
				}
			System.out.println();
			}
			sc.close();
		}
}


