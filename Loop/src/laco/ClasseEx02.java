package laco;

public class ClasseEx02 {
	
	public int num, par, impar;

	public String parImpar() {
		for(num = 0; num < 11; num++) {
		if((num % 2) == 0) {
			//System.out.println("PAR: " + num); Quais são pares
			par++;
		}else {
			//System.out.println("IMPAR: " + num); Quais são impares
			impar++;
				}
			}
		return "Quantos são PAR: " + par + "\n" + "Quantos são IMPAR: " + impar;
		}
	
	public String toString() {
		return parImpar();
	}
}
