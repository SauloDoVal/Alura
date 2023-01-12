package ByteBank;

// As cliente is going to implement the class Autenticavel we use the sintax implements instead of extends 

// this forces us to implement the method setSenha and autentica... It is a contract set between the cliente and the autenticavel interface.

public class Cliente implements Autenticavel {

	// To eliminate the duplicated code that we are using at the GerenteCerto,
	// Cliente and Administrador to validade the password, we can fix that by creating a standard constructor. 
	// Inside this standard constructor we will add our interface AutenticacaoUtil 
	
	
		//private int senha; // The password wont be saved by private int senha anymore, but by private AutenticacaoUtil util;
	
	
	private AutenticacaoUtil autenticador;
		
		
	public Cliente() {
		 this.autenticador = new AutenticacaoUtil();
	}



	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override // I will delegate the logic of the method to my class AutenticacaoUtil
	// I am checking if it is true or false with a boolean using the variable autenticou.
	public boolean autentica(int senha) {
//		boolean autenticou = this.util.autentica(senha);
//		return autenticou; ==> This is the same as :
		return this.autenticador.autentica(senha);
		
	}
}
