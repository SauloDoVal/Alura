package ByteBankComposto;

public class Conta {

	private double saldo;
	int agencia = 42; 
	int numero;
	//Cliente titular = new Cliente(); // Posso determinar como default que toda conta aberta vai criar automaticamente um novo cliente... já de base, não vamos deixar isso assim pq existem situações de um cliente só ter 2 contas e etc. 
	Cliente titular;
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}
	
	
}
