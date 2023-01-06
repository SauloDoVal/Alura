package sintaxesVariaveisEFluxos;

public class TestaConversao {
	
	public static void main (String [] args) {
		
		double salario = 1270.50;
		//int valorIntGuardandoDouble = salario; 
		// não vai complilar, pq não posso por um double dentdo de uma var int.
		
		int valorIntGuardandoDouble = (int)salario; //Pra rolar eu preciso de um Casting (int)
		
		System.out.println(valorIntGuardandoDouble + " só rolou por causa do casting (int)...");
		
		// O contrário pode acontecer... posso por um int dentro de um double
		int valorInt = 3000;
		
		double valorDoubleGuardandoInt = valorInt; 
		
		System.out.println(valorDoubleGuardandoInt + " só vai add um 0...");
		
		
		// Pra tipo varios bi ao quadrado... grandão mesmo, tenho que meter um "l" no fim, pra confimar que é isso mesmo.
		
		long numeroGrande = 1234123413241123412L; 
		
		//pra numero pequeno temos o short, não precisa da palhacada do "l" ou análogo no final
	
		short numeropequeno = 12344;
		
		// Menor ainda que o short é o byte, que vai até 127; 
		
		byte numeropequenininho = 127; 
		
		float pontoFlutuante = 3.14f; // isso é por vezes usado, mas não cabe 64bits como o long... tem que por  o "f" no final
		
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total + " Deu um reslultado meio louco com um monte de zero até o 4... isso é uma decisão dos programadores da linguagem e tem um pq... que bem, não interessa agora "); 
		
		
		
		
	}

}
