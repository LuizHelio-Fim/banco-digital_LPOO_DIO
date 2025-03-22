package org.dio.accounts;

public abstract class Conta implements IConta{
	
	private static final int PATTERN_AGENCY = 0001;
	private static int SEQUENCIAL = 1;

	protected int agency;
	protected int number;
	protected double balance;
	
	public Conta() {
		this.agency = PATTERN_AGENCY;
		this.number = SEQUENCIAL++;
	}

	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public void sacar(double value) {
		this.balance -= value;
	}

	@Override
	public void depositar(double value) {
		this.balance += value;
	}

	@Override
	public void transferir(Conta contaDestino, double value) {
		this.sacar(value);
		contaDestino.depositar(value);
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agency));
		System.out.println(String.format("Numero: %d", this.number));
		System.out.println(String.format("Saldo: R$%.2f", this.balance));
	}
	
}
