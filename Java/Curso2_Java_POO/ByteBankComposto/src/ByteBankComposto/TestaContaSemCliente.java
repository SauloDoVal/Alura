 package ByteBankComposto;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		
		System.out.println(contaDaMarcela.getSaldo()); // mesmo sem saldo anteriormente atribuido, vai compilar com valor ZERO
		
		
//		contaDaMarcela.titular.nome = "Marcela"; 
//		System.out.println(contaDaMarcela.titular.nome); // Vai dar ruim pq não fiz um "new Cliente()"... Null = referência para lugar nenhum, ou seja, o Cliente nem existe na memória. 

		// Agora, se eu meto isso daqui... 
	
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular); // Agora sim, já vai me apontar para um novo endereço de memória. 
		
		//E agora eu posso continuar com o código 
		
		contaDaMarcela.titular.nome = "Marcela Banguela"; 
		System.out.println(contaDaMarcela.titular.nome); // Agora rolou...
		
		
	}
	

}
