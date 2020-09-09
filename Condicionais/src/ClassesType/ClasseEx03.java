package ClassesType;

public class ClasseEx03 {
	
	public int age;
	
	public String category() {
		if(age >= 10 && age <= 14) {
			return "INFANTIL";
		}else if(age >= 15 && age <= 17) {
			return "JUVENIL";
		}else if(age >= 18 && age <= 25) {
			return "ADULTO";
		}
		return category();
	}
	
	public String toString() {
		return "Sua categoria é: "
				+ category();
	}
	
}
