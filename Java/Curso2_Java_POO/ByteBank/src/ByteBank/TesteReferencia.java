package ByteBank;

public class TesteReferencia {
	
	public static void main(String[] args) {
		
		
		
		Conta primeiraConta = new Conta(); 
		primeiraConta.saldo = 350; 
		
		System.out.println("saldo da prmeira conta é: " + primeiraConta.saldo); // Saldo = 350
		
		
		Conta segundaConta = primeiraConta; 
		//Não fazemos uma cópia aqui, só damos duas referências iguais a mesma coisa. 
		//Elas estão sendo encaminhadas para o mesmo endereço de memória... 
		
		System.out.println("saldo da prmeira/segunda conta é: " + segundaConta.saldo);
		segundaConta.saldo = segundaConta.saldo + 10; 
		
		System.out.println("saldo da prmeira/segund conta é: " + segundaConta.saldo);
		System.out.println("saldo da prmeira/segund conta é: " + primeiraConta.saldo);
		segundaConta.saldo = primeiraConta.saldo + 10; 
		
		System.out.println("saldo da prmeira/segund conta é: " + segundaConta.saldo);
		System.out.println("saldo da prmeira/segund conta é: " + primeiraConta.saldo);
	//mudando uma vc altera a outra... posso até confirmar que são a mesma conta utiliando um "if"
		
		
		if(primeiraConta == segundaConta) {
			System.out.println("As contas são a mesma conta... pq possuem o mesmo endereço de memória");
		} else {
			System.out.println("São contas diferentes");
		}
		
		
		// esse endereço de memória compartilhado pode ser verificado por um sout tb... 
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	
		
		
		
		
		
		
		
	}
	
}
