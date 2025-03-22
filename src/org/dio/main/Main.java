package org.dio.main;

import org.dio.accounts.*;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(1500);
		
		Conta poupanca = new ContaPoupanca();
		
		cc.transferir(poupanca, 500);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
