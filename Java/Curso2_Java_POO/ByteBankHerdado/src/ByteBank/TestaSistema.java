package ByteBank;

public class TestaSistema {
	
	public static void main(String[] args) {
		
		
		GerenteCerto g1 = new GerenteCerto();
		
		g1.setSenha(3333);
		
		Administrador a1 = new Administrador();
		g1.setSenha(3233);
		
		
		//It wont work with the other classes that do not implements the interface Autentica 
//		Designer d1 = new Designer();
//		d1.setSenha(1111);
		
		Cliente c1 = new Cliente();
		c1.setSenha(1111);

		
		
		
		SistemaInterno sis = new SistemaInterno(); 
		sis.autentica(g1);
		System.out.println();
		sis.autentica(a1);
		System.out.println();
		sis.autentica(c1);
		
		
	}
	
	

}
