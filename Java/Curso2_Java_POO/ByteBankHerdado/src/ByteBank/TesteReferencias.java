package ByteBank;

public class TesteReferencias {

	
	public static void main(String[] args) {
		
		GerenteCerto g1 = new GerenteCerto();
		// I can also declare in the most generic way, instead of using the class GerenteCerto, I can use the class Funcionario
		
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		String nome = g1.getNome();
		System.out.println(nome);
		
		// I can also declare in the most generic way, instead of using the class GerenteCerto, I can use the class Funcionario 
		// Even with funcinário been a abstract class, I am still creating a new GerenteCerto, and this is allowed 
		Funcionario g2 = new GerenteCerto();
		
		
		g2.setNome("John");
		String nome2 = g2.getNome();
		System.out.println(nome2);
	
		
		//This does not work the other way around... after all, all managers are workers, but not all workers are managers.
		//GerenteCerto g3 = new Funcionario();
		
		
//		g1.autentica(234);
		
		//g2.autentica(234); The method autentica will not work with g2, as it is a method from gerente, I created a Funcionário after all, and I can only use methods from the super class 
		// Funcionario g2 = new GerenteCerto(); // This is a example of polymorphism,  new GerenteCerto() is the object that we are creating, and Funcionario is its reference 
		 
			
//		This lines won't work anymore, as the funcionário class is now abstract.
//		//Funcionario f1 = new Funcionario ();
//		f1.setSalario(2000.0);
//		f1.setNome("João");
		
		
		
		EditorVideo e1 = new EditorVideo ();
		e1.setSalario(1000.00);
		e1.setNome("Edison");
		
		Designer d1 = new Designer ();
		e1.setSalario(1111.00);
		e1.setNome("Denis");
		
		ControleBonus controle = new ControleBonus();
		controle.registra(g1);
 		controle.registra(e1);
		controle.registra(d1);
		 
		System.out.println(controle.getSoma());
		
		
		
	}
	
	
}
