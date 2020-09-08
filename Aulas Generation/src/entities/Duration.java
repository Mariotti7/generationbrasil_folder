package entities;

public class Duration {
	
	public int hour;
	public int minute;
	public int second;
	
	public int hour() {
		return second / 3600;
	}
	
	public int minute() {
		return (second % 3600 )/ 60;
	}
	
	public int second() {
		return (second % 3600) % 60;
	}
	
	public String toString() {
		return "O evento durou: "
				+"\n"
				+ hour()
				+" horas"
				+"\n"
				+minute()
				+" minutos"
				+"\n"
				+second()
				+" segundos"
				;
	}
}
