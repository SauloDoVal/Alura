package BBHConta;

public class TestaConta {

	public static void main(String[] args) throws SaldoInsuficienteException {

		//This is a part of the exception course that I am training here
//		ContaCorrente outra = null; // I am initializing this reference, but I am not pointing at a object. 
//		outra.deposita(200.0); // I am depositing a value at a account that does not exist 
//		//The IDE is showing a error with a caution sining, but it is still compiling 
//		System.out.println(outra.getSaldo());//But if I try to print this, it will give me a null pointer... as there is no object at this pointer.
//		
//		int a = 3; 
//		int b = a / 0; // once again the syntax is ok, but there is a problem mathematical problem as we cannot divide a number by zero... therefore we have a AritimeticExeption 
//		
		
		
		
		ContaCorrente cc1 = new ContaCorrente(111,111);
		cc1.deposita(100.0);
		
		ContaPoupanca cp1 = new ContaPoupanca(222, 222);
		cp1.deposita(200.0);
		
		cc1.transfere(10, cp1);
		
		System.out.println("CC:" + cc1.getSaldo());
		System.out.println("CP:" + cp1.getSaldo());
		
		
	}

}
