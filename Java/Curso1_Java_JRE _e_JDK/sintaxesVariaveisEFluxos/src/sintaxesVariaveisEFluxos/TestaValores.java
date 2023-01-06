package sintaxesVariaveisEFluxos;

public class TestaValores {
	
	public static void main (String[] args) {
		
		int primeiro = 5; 
		int segundo = 7;
		System.out.println(segundo);// imprime 7
		segundo = primeiro;   
		System.out.println(segundo); // imprime 5
		primeiro = 10; 
		System.out.println(segundo); // imprime 5 ainda... pq a atribuição ficou la tras...
		segundo = primeiro; 
		System.out.println(segundo); // agora sim, imprime 10... 
		
		
	} 
	
	
	

}
