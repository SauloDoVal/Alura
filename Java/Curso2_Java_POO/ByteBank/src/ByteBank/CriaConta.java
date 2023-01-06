package ByteBank;

public class CriaConta {

	public static void main(String[] args) {

		// new Conta(); // Aqui eu estou instanciando uma conta... um objeto.

		Conta primeiraConta = new Conta(); // Aqui eu estou referenciando/individualizando esta conta, dando-lhe
											// nome(primeiraConta). Eu inicio a frase dizendo que conta é uma variável
											// do "tipo" Conta.

		primeiraConta.saldo = 200; // Agora, podendo referenciar a primeira conta que foi devidamente "construida",
									// posso dizer que o seu saldo é 200.

		System.out.println(primeiraConta.saldo); // como temos um valor atribuido ao saldo, agora eu consigo imprimir.
		System.out.println(primeiraConta.titular); // Como os demais atributos não foram definidos eles irão dar null
													// (String) ou 0 (int). Estes são os valores default
		System.out.println(primeiraConta.numero); 
		System.out.println("O número da agencia é: "+ primeiraConta.agencia); // No construtor, lá na classe Conta, eu posso estabelecer outros valores default...
		//Nessa parte do código eu ainda não instanciei a segundaConta, mas quando instanciar, já vai estar setada a agencia 42 tb. 
		
		
		
		// Posso realizar operações aritiméticas com o nosso saldo já estabelecido.

		primeiraConta.saldo += 100; // vai imprimir 300
		System.out.println(primeiraConta.saldo); // como temos um valor atribuido ao saldo, agora eu consigo imprimir.

		Conta segundaConta = new Conta(); // criando agora a nossa segunda conta
		segundaConta.saldo = 50; // determinei que a segunda conta possui um saldo de 50...esta é uma conta
									// completamente diferente, nada vai mudar na primeiraConta.
		System.out.println("Na segunda conta tem: " + segundaConta.saldo);
		System.out.println("Na primeira conta tem: " + primeiraConta.saldo);
		
		
		//Eu posso mudar o valor default sem problema... inicialmente o valor default da agência de todas as contas era 42
		System.out.println("O número da agencia é: " + segundaConta.agencia); // vai imprimir 42
		segundaConta.agencia = 146;// mudei o número da agência  
		System.out.println("O número da agencia é: " + segundaConta.agencia); // vai imprimir 146
		
		
		
		
		if(primeiraConta == segundaConta) {
			System.out.println("As contas são a mesma conta... pq possuem o mesmo endereço de memória");
		} else {
			System.out.println("São contas diferentes neste caso... completamente autônomas");
		}
		
		// esse endereço de memória compartilhado pode ser verificado por um sout tb... 
		
				System.out.println(primeiraConta);
				System.out.println(segundaConta);
		
		
	}

	
	
	
	
	
	
}
