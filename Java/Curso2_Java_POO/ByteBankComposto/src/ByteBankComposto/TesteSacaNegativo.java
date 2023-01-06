package ByteBankComposto;

public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(); 
		conta.deposita(100); 
		conta.saca(200); // Não vai acontecer saque devido a condição posta no "if" 
//		System.out.println(conta.saldo); // O saldo vai continuar 100... 
//		
//		//Mas eu posso forçar a atribuição de um valor negativo da seguinte forma. 
//		conta.saldo = conta.saldo -101;
//		System.out.println(conta.saldo); // vai imprimir -1
//		// Mas o ideial é que isso seja proibido... isso é mexer no "motor do carro" e a gente não quer que o nosso "motorista" tenha acesso a isso... só ao nosso acelerador, só a nossa interfase. 
//		// Pra parar com essa farra dos outros mexerem, deixamos o atributo privado... ao fazer isso no atributo da conta, quebramos a linha de código acima e asseguramos que o saldo não vai ser alterado, se não pelos métodos pre-estabelecidos
//		// Ao transformar um atributo em privado, não quer dizer que eu o transformei em somente leitura, eu perco acesso a ele fora da classe em geral, não posso fazer souts...
//		// Vou ter que criar um método que me devolve o saldo... vou ter que criar um famoso GETTER, para poder ter acesso... via método. 
//		 
		// Agora para ter acesso ao saldo que esta em privado usamos o método abaixo
		
		System.out.println(conta.getSaldo()); // que vai imprimir o famigerado 100
		
		
	}

}
