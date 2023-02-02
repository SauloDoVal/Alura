package br.com.byteBank.BBHConta.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.byteBank.BBHConta.modelo.Conta;
import br.com.byteBank.BBHConta.modelo.ContaCorrente;
import br.com.byteBank.BBHConta.modelo.ContaPoupanca;

public class TesteComCamparatorPorNumeroDeConta {

    public static void main(String[] args) {

            Conta cc1 = new ContaCorrente(22, 33);
            cc1.deposita(333.0);

            Conta cc2 = new ContaPoupanca(22, 44);
            cc2.deposita(444.0);

            Conta cc3 = new ContaCorrente(22, 11);
            cc3.deposita(111.0);

            Conta cc4 = new ContaPoupanca(22, 22);
            cc4.deposita(222.0);

            List<Conta> lista = new ArrayList<>();
            lista.add(cc1);
            lista.add(cc2);
            lista.add(cc3);
            lista.add(cc4);
            
            
            
            
            System.out.println("-------CONTAS NÃO ORDENADAS--------");
            for (Conta conta : lista) {
				System.out.println(conta);
			}
            
            
            NumeroDaContaComparator comparator = new NumeroDaContaComparator();
            
            
            
            System.out.println("--------CONTAS ORDENADAS--------");
            lista.sort(comparator);

            for (Conta conta : lista) {
				System.out.println(conta);
			}
            
            
            
    }

}

class NumeroDaContaComparator implements Comparator<Conta>{

	
	//What I am doing here is setting a method to organize the accounts according to their numbers.
	//if c1 is less than c2 it will return me a negative number, stating that it is false, 
	//if c1 is more than c2, it will return me a positive number, so the statement will be true. and 0 for the same number. 
	
	@Override
	public int compare(Conta c1, Conta c2) {
		
		if(c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		if(c1.getNumero() > c2.getNumero()) {
			return 1;
		}
		return 0;
	}
	
	//What I am doing 
	
	
	
	 
}