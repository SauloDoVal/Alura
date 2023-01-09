package ByteBankEncapsulado;

public class Conta {

	private double saldo;
	private int agencia = 42; 
	private int numero;
	private Cliente titular;
	private static int total; // posso criar este atributo para calcular o número de contas criadas, botando um total++ no construtor. Mas eu tenho que botar o atributo como 'Static'... tem um pouquinho de noção de variavel global aqui... mas global aos objetos... não confundir 
	//com o static o total determinado aqui vira um total da classe. 
	
	
	
	
	//Cliente titular = new Cliente(); // Posso determinar como default que toda conta aberta vai criar automaticamente um novo cliente... já de base, não vamos deixar isso assim pq existem situações de um cliente só ter 2 contas e etc. 

	
	//Sintaticamente falando, o método construtor não é um método, é uma rotina de inicialização... Eu posso determinar que para ser inicializado, o método construtor vai precisar de uma conta e agência, por exemplo. 
	
	 
	
	public Conta(int agencia, int numero) {
		Conta.total++; // por conta do static, o this. está errado, tenho que por o nome da classe... 
		System.out.println("O total de contas criadas no banco é de: " + Conta.total);
		this.agencia = agencia; 
		this.numero = numero;
		System.out.println("Estou criando a conta Nº: " + this.numero + "na Agência Nº: " + this.agencia);
		
		
	}
	
	public Conta() {} // Eu posso forçar o código a continuar me dando o contrutor default escrevendo ele e deixando vazio, mas isso em geral não é uma boa prática 
	
	
	
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
		if(novoNumero <= 0) {
			System.out.println("O número de conta : " +novoNumero + " não é permitido. O Número da conta não pode ser menor ou igual a ZERO");
			return; 
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("O número de agência : " + agencia + " não é permitido. O Número da Agência não pode ser menor ou igual a ZERO");
			return; //Boto um return para não executar a linha a baixo e gravar o número que a gente não quer. 
		}
		this.agencia = agencia;
			System.out.println("Número aprovado, o número da sua agência é: " + agencia);
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
		//Neste getter eu tb não vou colocar um this... tenho que por o nome Conta., por se tratar do nome desta classe.
		// Eu posso pedir para uma conta em particular me voltar o número total de contas, mas se no main eu quero que a Conta me volte isso, tenho que meter um static no método. 
	}
	
	
	
}
