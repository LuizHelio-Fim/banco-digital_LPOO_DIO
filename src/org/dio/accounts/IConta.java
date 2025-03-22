package org.dio.accounts;

public interface IConta {
	
	void sacar(double value);
	
	void depositar(double value);
	
	void transferir(Conta contaDestino, double value);
}
