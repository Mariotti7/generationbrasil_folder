package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;
import entidades.Pessoa;
import entidades.Professor;

public class Cadastro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("SISTEMA DE CADASTRO");

		Pessoa fulano = new Pessoa("JOAO", 1907, " ", 'M');// construtor serve para criar a regra de como será o objeto
		Pessoa sicrano = new Pessoa("Maria", 1980, "INDIGENA");
		Aluno alunoNovo = new Aluno("Green", "Turma 8");
		Professor novoProfessor = new Professor("LUIZA", "MODULO-II");

		System.out.println(novoProfessor.getNome() + " " + novoProfessor.getMateriaLecionada());
		System.out.println(alunoNovo.getTurma());

		sc.close();

	}

}
