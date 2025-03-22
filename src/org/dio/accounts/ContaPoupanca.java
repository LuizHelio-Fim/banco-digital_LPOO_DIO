package org.dio.accounts;

public class ContaPoupanca extends Conta{

	@Override
	public void imprimirExtrato() {
		System.out.println("--- EXtrato Conta Poupança ---");
		imprimirInfosComuns();

	}
}