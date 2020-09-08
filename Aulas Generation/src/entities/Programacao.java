package entities;
public class Programacao {
	
	public int age;
	public int mounth;
	public int year;
	public int day;
	
	public int year() {
		return year;
	}
	
	public int mounth() {
		return mounth;
	}
	
	public int day() {
		return day += (year * 365) + (mounth * 30);
	}
	
	public int age() {
		return day();
	}
	
	public String toString() {
		return "Sua idade em dias é "
				+ age();
	}
}
