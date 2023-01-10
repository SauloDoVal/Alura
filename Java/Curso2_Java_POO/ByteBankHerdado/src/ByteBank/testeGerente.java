package ByteBank;

public class testeGerente {

	
	public static void main(String[] args) {
		
		
		
		GerenteCerto g1 = new GerenteCerto();
		g1.setNome("Geraldo");  // Todos os dados como nome e CPF estão surgindo devido a herança que o GerenteCerto tem do funcionário 
		g1.setCpf("111.111.111-00");
		g1.setSalario(5000);
		 
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf()); 
		System.out.println(g1.getSalario());
		
		
		//A senha é um parâmetro pertencente só a Gerente... e conseguimos tb determinar por aqui, chamando o g1
		g1.setSenha(1234);
		
		boolean autenticou = g1.autentica(1234);
				
		System.out.println(autenticou);
		
		System.out.println(g1.getBonus());
		
	}
	
}
