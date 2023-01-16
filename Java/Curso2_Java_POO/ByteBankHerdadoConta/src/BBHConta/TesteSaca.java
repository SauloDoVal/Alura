package BBHConta;

public class TesteSaca {
	
	
	public static void main(String[] args) {
		
		
		Conta conta = new ContaCorrente (123,321);
		
		conta.deposita(2000.0);
		System.out.println("Valor antes de tentar sacar: " + conta.getSaldo());
		conta.saca(1500.0);
		System.out.println("Valor depois do primeiro saque: " + conta.getSaldo());
		conta.saca(500.0);
		System.out.println("Valor depois do segundo saque... valor que ultrassa valor em conta:  " + conta.getSaldo()); // this won't print as a exception is thrown before  
	}

}
