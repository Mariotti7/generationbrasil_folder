package aplicacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Scanner;

import entidades.ContaCorrente;
import entidades.ContaEmpresa;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tipoConta, tipoOperacao;
		double depositar, sacar, talonario, usarLimite;

		// Contas de exemplo
		ContaPoupanca clientePoupanca = new ContaPoupanca(000001, 0.02, 0.03, 10);
		ContaCorrente clienteCorrente = new ContaCorrente(000002, 10);
		ContaEmpresa clienteEmpresa = new ContaEmpresa(000003, 50000);
		ContaEspecial clienteEspecial = new ContaEspecial(000002);
		Collection<ContaPoupanca> extrato = new ArrayList();

		
		// Teste do programa

		System.out.print("Entre com seu código de segurança: ");
		int codigoConta = sc.nextInt();
		System.out.println("--- Seja bem vindo --- \nConta número: " + codigoConta);
		System.out.println("Informe o tipo de conta: ");
		System.out.printf("(1) - Poupança\n(2) - Corrente\n(3) - Empresa\nDigite a opção desejada: ");
		tipoConta = sc.nextInt();
		System.out.println();
		if (tipoConta == 1) {
			System.out.printf(
					"Informe a operação desejada: \n(1)- Emitir extrato\n(2) - Depositar\n(3) - Sacar\nDigite sua opção: ");
			tipoOperacao = sc.nextInt();
			System.out.println();
			if (tipoOperacao == 1) {
				clientePoupanca.emiteExtrato();
			} else if (tipoOperacao == 2) {
				System.out.println("Qual valor você deseja depositar :");
				depositar = sc.nextDouble();
				clientePoupanca.credite(depositar);
			} else if (tipoOperacao == 3) {
				clientePoupanca.credite(500);
				System.out.print("Seu saldo é: ");
				clientePoupanca.emiteExtrato();
				System.out.println("Qual valor você deseja sacar :");
				sacar = sc.nextDouble();
				if (clientePoupanca.getSaldo() >= sacar) {
					clientePoupanca.debite(sacar);
				} else {
					System.out.println("Você não tem saldo suficiente para efetuar esse saque");
				}
			}
			System.out.print("Seu saldo é: ");
			clientePoupanca.emiteExtrato();
		} else if (tipoConta == 2) {
			System.out.printf(
					"Informe a operação desejada: \n(1)- Emitir extrato\n(2) - Emitir talonario\n(3) - Usar limite\nDigite sua opção: ");
			tipoOperacao = sc.nextInt();
			System.out.println();
			if (tipoOperacao == 1) {
				clientePoupanca.emiteExtrato();
			} else if (tipoOperacao == 2) {
				System.out.println("Quantos talões você deseja emitir: ");
				talonario = sc.nextDouble();
				for (int i = 0; i < 1; i++) {
					if (talonario <= 5) {
						clienteCorrente.emiteTalonario();
					} else {
						System.out.println("[ATENÇÃO] O seu contrato só permite o total de 5");
						System.out.println("Quantos talões você deseja emitir: ");
						talonario = sc.nextDouble();
						if (talonario <= 5) {
							clienteCorrente.emiteTalonario();
							System.out.printf("Você emitiu %.2f talonarios", talonario);
						} else {
							System.out.println("OPERAÇÃO ENCERRADA");
							break;
						}
					}
					System.out.printf(
							"Informe a operação desejada: \n(1)- Emitir extrato\n(2) - Emitir talonario\n(3) - Usar limite\nDigite sua opção: ");
					tipoOperacao = sc.nextInt();
					System.out.println();
				}
			} else if (tipoOperacao == 3) {
				System.out.print("Deseja usar o seu limite? [1] SIM ou [2] NAO: ");
				usarLimite = sc.nextDouble();
				if (usarLimite == 1) {
					double credite = 500.00;
					clienteCorrente.credite(credite);
					double juros = 0.16; // juros taxa selic de 2% ao ano
					clienteEspecial.calculaJuros(juros);
					
				}
				System.out.print("Seu saldo é: ");
				clientePoupanca.emiteExtrato();
				System.out.println("Qual valor você deseja sacar :");
				sacar = sc.nextDouble();
				if (clientePoupanca.getSaldo() >= sacar) {
					clientePoupanca.debite(sacar);
				}
			}
		}
		sc.close();
	}
}