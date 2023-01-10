package BBHConta;

public class ContaPoupanca extends Conta {
	
	
	// For this constructor to work I will need to create a constructor that makes reference to the superclass, or... create a default constructor (blank) at the constructor class myself
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero); 
		
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
