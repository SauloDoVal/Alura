package br.com.byteBank.BBHConta.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel{

	// For this constructor to work I will need to create a constructor that makes
	// reference to the superclass, or... create a default constructor (blank) at
	// the constructor class myself
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override // @Override is a notation for the Java Compiler showing that we are changing
				// the method of the superclass, when you are overriding a method, you must
				// maintain its Characteristics, like been public, a boolean and etc.
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;  // I am charging 20 cents for every transaction, showcasing how polymorphism works 
		 super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta Corrente: " + super.toString(); // using the toString from the mother class "Conta"

}
}