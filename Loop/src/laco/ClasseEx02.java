package laco;

public class ClasseEx02 {
	
	public int num, par, impar;

	public String parImpar() {
		for(num = 0; num < 11; num++) {
		if((num % 2) == 0) {
			//System.out.println("PAR: " + num); Quais s�o pares
			par++;
		}else {
			//System.out.println("IMPAR: " + num); Quais s�o impares
			impar++;
				}
			}
		return "Quantos s�o PAR: " + par + "\n" + "Quantos s�o IMPAR: " + impar;
		}
	
	public String toString() {
		return parImpar();
	}
}
