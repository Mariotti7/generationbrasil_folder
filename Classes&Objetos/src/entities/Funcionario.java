package entities;

public class Funcionario {
	//atributos
	public static String nomeFuncionario;
	public static String matriculaFuncionario;
	public static double salarioFuncionario;
	public static double horaTrabalhada;
	
	
	//metodos

	
	public static void mostrar() {
		System.out.println("\nFuncionario: " + Funcionario.nomeFuncionario.toUpperCase());
		System.out.println("Matricula: " + Funcionario.matriculaFuncionario);
		System.out.println("Hora trabalhada: " + Funcionario.horaTrabalho(horaTrabalhada));
		System.out.println("Salario: " + Funcionario.contaSalario(horaTrabalhada));
	}
	
	public static double horaTrabalho(double horaTrabalhada) {
		return horaTrabalhada;
	}
	
	public static double contaSalario(double horaTrabalho) {
		return horaTrabalho = horaTrabalho * salarioFuncionario;
	}
}
