package entities;

public class Programacao2 {

	public int days;
	public int mounth;
	public int year;
	
	public int year() {
	return days / 365;
	}
	
	public int mounth() {
		return days / 30;
	}
	
	public int days() {
		return days * 365;
	}
	
	public String toString() {
		return "Sua idade em dias é: "
				+ days()
				+"\n"
				+"Em meses é: "
				+ mounth()
				+"\n"
				+"Em anos é: "
				+year();
	}
	
}
