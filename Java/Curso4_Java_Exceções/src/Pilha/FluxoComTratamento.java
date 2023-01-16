package Pilha;

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Excessão: " + msg);
			ex.printStackTrace();
		}

		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");

		ArithmeticException exception = new ArithmeticException(
				"Se eu deixo sem nada, da null... mudei a msg para Deu ruim");
		throw exception;
		// ArithmeticException is a class... As a class, we can create objects with it,
		// at first we create
		// just the object, not the exception itself... for that we will need to throw
		// it.
		// doing that we are interrupting the flow, our try/catch at the method main
		// gets it and deals with it showing what we have programmed for such cases and
		// end the method.

//		Conta conta = new Conta();
//		throw conta;
		// I cannot throw conta... in fact I can only throw exceptions.
		// We have a better sintax than the above... we can write //throw new ArithmeticException ("É cilada Bino");
		
		
//		System.out.println("Fim do metodo2");
	}

}
