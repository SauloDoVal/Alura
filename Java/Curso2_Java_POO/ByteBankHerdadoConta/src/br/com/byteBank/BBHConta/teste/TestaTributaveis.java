package br.com.byteBank.BBHConta.teste;

import br.com.byteBank.BBHConta.modelo.*;

public class TestaTributaveis {
	
	public static void main(String[] args) {
		
		
		ContaCorrente cc1 = new ContaCorrente(111, 101);
		cc1.deposita(100.0);
		
		
		SeguroDeVida sDV = new SeguroDeVida();
		
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc1);
		calc.registra(sDV);
		
		
		System.out.println(calc.getTotalImposto()); //42 from SeguroDeVda, the magic number we have defined... and 1 = 1% of 100 we have deposit at CC
		
		
	}

}
