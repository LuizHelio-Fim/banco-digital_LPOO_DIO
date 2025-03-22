package org.dio.accounts;

public class ContaCorrente extends Conta{

	@Override
	public void imprimirExtrato() {
		System.out.println("--- EXtrato Conta Corrente ---");
		imprimirInfosComuns();

	}
	
}