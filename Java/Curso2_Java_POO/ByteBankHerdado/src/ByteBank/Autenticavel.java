package ByteBank;


//when creating an interface we create a contract, assuring that the classes that implements the interface will use the following methods 
// method setSenha && autentica 


public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
