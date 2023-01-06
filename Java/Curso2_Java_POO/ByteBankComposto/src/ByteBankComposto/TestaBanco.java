package ByteBankComposto;

public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente(); 
		paulo.nome = "Paulinho Gente Fina";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Professor";
		
		
		System.out.println(paulo.nome);
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		System.out.println(contaDoPaulo.getSaldo());
		
		//Associamos a contaDoPaulo ao Cliente paulo
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular); // Vai me imprimir o endereço de memória
		System.out.println(contaDoPaulo.titular.nome); //Vai me imprimir o nome do cliente... agora, via titular. eu posso acessar todos os dados do cliente
		
	}
	
	
}
