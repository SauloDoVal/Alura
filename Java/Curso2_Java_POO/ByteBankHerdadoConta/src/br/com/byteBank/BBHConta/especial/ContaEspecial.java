package br.com.byteBank.BBHConta.especial;

import br.com.byteBank.BBHConta.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor; // I cannot do that, as saldo is private, does not matter the inheritance between this class and its mother class, the fact that saldo is private or default (blank) and in another package blocks it. 
	} // I can access if it is public or protected (protected due to the inheritance relationship).

}
