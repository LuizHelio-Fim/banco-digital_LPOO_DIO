package org.dio.main;

import org.dio.accounts.*;

public class Main {

	public static void main(String[] args) {
		Cliente luiz = new Cliente();
		luiz.setNome("Luiz");
		Conta cc = new ContaCorrente(luiz);
		cc.depositar(1500);
		
		Conta poupanca = new ContaPoupanca(luiz);
		
		cc.transferir(poupanca, 500);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
