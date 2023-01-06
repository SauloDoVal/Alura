package ByteBankEncapsulado;

public class TestaGetESet {
	public static void main(String[] args) {
		
		
		Conta conta = new Conta();
		//conta.numero=123543 // Não vai compilar mais, o argumento é privado, evidentemente vamos ter que utilizar do nosso SET
		
		conta.setNumero(123543); // VANTAGEM: Se for o caso, posso botar um monte de lógica no método parametrizando como devem ser os números de conta
		
		
		// agora compila, para imprimir, vamos ter que utilizar o Get
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo ... não posso fazer isso mais pq o método está privado e temos que recorrer ao SETTER
		
		paulo.setNome("Paulo Paullete");
		
		conta.setTitular(paulo);
		
		//antes, quando tudo era público,  para imprimir o nome pela conta escrevíamos : 
		//System.out.println(conta.titulat.nome);
		//Agora, com tudo privado usamos a seguinte linha de getters. 
		
		System.out.println(conta.getTitular().getNome()); // Vai imprimir Paulo Paullete
		
		conta.getTitular().setProfissao("Astronauta");
		//A linha acima pode ser escrita da seguinte forma. 
		
		System.out.println(paulo.getProfissao());
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Mecânico");
		
		System.out.println(paulo.getProfissao());
		
		
		
		
		
	}

}
