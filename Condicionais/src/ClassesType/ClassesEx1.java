package ClassesType;

public class ClassesEx1 {
	public int num1;
	public int num2;
	public int num3;
	
	public int biggerNumber() {
		if(num1 > num2 && num1 > num3) {
			return num1;
		}else if(num2 > num3 && num2 > num1) {
			return num2;
		}else {
			return num3;
		}
	}
	
	public String toString() {
		return "O número maior é: " + biggerNumber();
	}
}
