package Pilha;

public class Fluxo2 {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception ex) {
		//catch (ArithmeticException | NullPointerException | MinhaExcecao ex) { // I can create a very generic exception by putting Exception a super class for all exceptions as the parameter  a 
			String msg = ex.getMessage();
			System.out.println("Excessão: " + msg);
			ex.printStackTrace();
		}

		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao  {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("Exceção criada por mim"); // This won't compile at first as there is no constructor that
															// receives a string
		// After creating a contructor at the MinhaExcecao class, things will work.
		// At first we did not catch the exception, as the catch is only catching
		// AritimeticExpetion and NullPoiterExcepiton. It dropped in the main... to
		// avoid this lets add MinhaExcecao at the catch. after doing so, the catch treat the exception and Fim do main appears at the console. 

//        System.out.println("Fim do metodo2");
	}
}