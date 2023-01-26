package Pilha;

public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo conexão");
    }

    public void leDados() {
        System.out.println("Recebendo dados"); //Shows that the object you are manipulating has a inconsistent state, extends RuntimeExeption, therefore is unchecked
            throw new IllegalStateException();
    }

//    public void fecha() {
//        System.out.println("Fechando conexão");
//    }

	@Override
	public void close() { //throws Exception { // I can remove the exception without breaking the code 
		 System.out.println("Fechando conexão");		
	}
}
