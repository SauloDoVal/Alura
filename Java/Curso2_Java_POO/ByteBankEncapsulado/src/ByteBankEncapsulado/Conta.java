package ByteBankEncapsulado;

public class Conta {

	private double saldo;
	private int agencia = 42; 
	private int numero;
	private Cliente titular;
	
	//Cliente titular = new Cliente(); // Posso determinar como default que toda conta aberta vai criar automaticamente um novo cliente... já de base, não vamos deixar isso assim pq existem situações de um cliente só ter 2 contas e etc. 

	
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
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	
	
}
