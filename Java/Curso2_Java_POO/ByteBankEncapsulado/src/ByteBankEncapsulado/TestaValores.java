package ByteBankEncapsulado;

public class TestaValores {

	
	public static void main(String[] args) {
		
		
		//Conta conta = new Conta();  
		
		
		//Ainda posso criar contas e agências negativas e isto vai contra as nossas regras de negócio. 
		//Bora criar um if lá no conta.java para mudar isso. 
		//O problema só foi parcialmente resolvido, pq o 0 continua sendo o valor default da conta... ela nasce como 0... valor inconsistente com a nossa regra de negócios 
		//Resolvemos isso criando um método construtor.
		// construtor criado, já não posso mais deixar os () vazios na linha 6... tenho que fazer um contrutor e dar a ele as informações que pedi...
		
		
		Conta conta1 = new Conta(4321,1234);
		
		
		System.out.println("");
		
		
		
		
		conta1.setAgencia(-500);
		conta1.setNumero(0);
		System.out.println("Número de conta: "+ conta1.getAgencia());
		System.out.println("Número de Agência: " + conta1.getNumero());
		
		Conta conta2 = new Conta(2222,12222);
		Conta conta3 = new Conta(3333,13333);
		
		System.out.println("O número total de contas é: " + Conta.getTotal()); // to bontando Conta. em maiúsculo, to chamando a classe, para me imprimir esse get que pertence a classe como um todo. 

		
		
		
	} 
	
	

}
