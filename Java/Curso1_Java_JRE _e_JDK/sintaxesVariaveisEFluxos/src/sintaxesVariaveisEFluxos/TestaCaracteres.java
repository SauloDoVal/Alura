package sintaxesVariaveisEFluxos;

public class TestaCaracteres {

	public static void main (String[] args){
		
		
		char guardaUmaLetraSo = 'a'; // O char guarda uma letra só é temos que usar aspas simples.
				
		System.out.println(guardaUmaLetraSo);
		
		char naVerdadeOCharGuardaNumero = 65; // Vai imprimir o "A" maiúsculo, convertendo o 65 da tabela ASCII 
		
		System.out.println(naVerdadeOCharGuardaNumero);
		
		//Usando casting posso até fazer conta com o Char e subir o numero na tabela. 
		
		char letraA = 65; 
		
		char letraC = (char) (letraA + 2);
		
		System.out.println(letraC); // vai imprimir C que é igual 67 na tabela ASCII
				
		
		String texto = "alura cursos online de tecnologia"; 
		
		System.out.println(texto);
		
		
		texto = texto + 2020;
		System.out.println(texto); // evidentemente, não vai fazer como no caso do char e mudar o que tem dentro da varável, so vai add o 2020 no final.
		
		
		
	}
	
	
}
