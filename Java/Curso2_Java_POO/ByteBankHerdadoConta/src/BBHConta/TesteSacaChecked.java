package BBHConta;

public class TesteSacaChecked {
	
	
	public static void main(String[] args) {
		
		
		Conta conta = new ContaCorrente (123,321);
		
		conta.deposita(2000.0);
		System.out.println("Valor antes de tentar sacar: " + conta.getSaldo());
		try {
			conta.saca(2100.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exceção: " + ex.getMessage()  );
		}
		System.out.println("Valor depois do saque... :  " + conta.getSaldo()); // this won't print as a exception is thrown before  
	}

}
