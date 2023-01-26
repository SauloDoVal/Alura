package Pilha;

public class TesteConexao {

	public static void main(String[] args) {
		
		
		try (Conexao conexao = new Conexao()) {  // this new way to implement the method try already has the finally, this works without the catch because the finally is already there 
			conexao.leDados();
	} catch (IllegalStateException ex) {
		System.out.println("Erro de conexão");
		
	}

	}
}

//-------------------------------------- Código Antigo ---------------------------------------
//		
//		Conexao conexao = null;
//
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//			// conexao.fecha();
//		} catch (IllegalStateException ex) { // That way I am not closing the connection, with is far from ideal...
//												// Therefore... lets put this conexao.fecha(); at the catch as well
//			System.out.println("Erro de conexão");
//			// conexao.fecha(); // The idea here is that I want to close the connection with
//			// or without errors... and the Try/Catch has a more polite way to do that...
//			// the "finally"
//
//		} finally { // This is a block of code that is always going to be executed, doesn't matter
//					// the result of the try/catch.
//			conexao.fecha();
//
//		} // A try is never alone... it is followed by a catch or a finally... we can have a piece of code only with a try and a finally. 
//		// We can have multiple "cathces" but only one finally. 
//	}
//}
//
