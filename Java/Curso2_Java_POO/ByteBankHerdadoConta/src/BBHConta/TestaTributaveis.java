package BBHConta;

public class TestaTributaveis {
	
	public static void main(String[] args) {
		
		
		ContaCorrente cc1 = new ContaCorrente(111, 101);
		cc1.deposita(100.0);
		
		
		SeguroDeVida sDV = new SeguroDeVida();
		
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc1);
		calc.registra(sDV);
		
		
		System.out.println(calc.getTotalImposto());
		
		
	}

}
