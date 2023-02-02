package br.com.byteBank.BBHConta.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.byteBank.BBHConta.modelo.Cliente;
import br.com.byteBank.BBHConta.modelo.Conta;
import br.com.byteBank.BBHConta.modelo.ContaCorrente;
import br.com.byteBank.BBHConta.modelo.ContaPoupanca;

public class Teste {

    public static void main(String[] args) {

                    Conta cc1 = new ContaCorrente(22, 33);
                    Cliente clienteCC1 = new Cliente();
                    clienteCC1.setNome("Nico");
                    cc1.setTitular(clienteCC1);
                    cc1.deposita(333.0);

                    Conta cc2 = new ContaPoupanca(22, 44);
                    Cliente clienteCC2 = new Cliente();
                    clienteCC2.setNome("Guilherme");
                    cc2.setTitular(clienteCC2);
                    cc2.deposita(444.0);

                    Conta cc3 = new ContaCorrente(22, 11);
                    Cliente clienteCC3 = new Cliente();
                    clienteCC3.setNome("Paulo");
                    cc3.setTitular(clienteCC3);
                    cc3.deposita(111.0);

                    Conta cc4 = new ContaPoupanca(22, 22);
                    Cliente clienteCC4 = new Cliente();
                    clienteCC4.setNome("Ana");
                    cc4.setTitular(clienteCC4);
                    cc4.deposita(222.0);

                    List<Conta> lista = new ArrayList<>();
                    lista.add(cc1);
                    lista.add(cc2);
                    lista.add(cc3);
                    lista.add(cc4);

                    for (Conta conta : lista) {
                            System.out.println(conta);
                    }

//                    NumeroContaComparator numeroComparator = new NumeroContaComparator(); // Instead of using this kind of contructor, usually we add it directly in the method sort.
//                    NomeDoTitularComparator nomeComparator = new NomeDoTitularComparator();
                    
                    lista.sort(null); // If I leave it with null, it will use the natural method set at the class
                    
                    //Natual Method
                    //Collections.sort(lista, NumeroContaComparator());
//                    Collections.sort(lista);
//                    Collections.reverse(lista);	

                    System.out.println("-------CONTAS NÃO ORDENADAS--------");
                    for (Conta conta : lista) {
        				System.out.println(conta);
        			}
                    
                   
                    System.out.println("--------CONTAS ORDENADAS POR NUMERO DA CONTA --------");
                    //lista.sort(numeroComparator);
                    lista.sort(new NumeroContaComparator());
                    for (Conta conta : lista) {
        				System.out.println(conta);
        			
                    }
                    
                    System.out.println("--------CONTAS ORDENADAS POR NOME DO USUÁRIO DA CONTA --------");
                    //lista.sort(nomeComparator);
                    lista.sort(new NomeDoTitularComparator());
                    for (Conta conta : lista) {
                    System.out.println(conta + " , " + conta.getTitular().getNome());

    }

}
}
class NomeDoTitularComparator implements Comparator<Conta> {
	
	//Now, we will try to create a method that compares names of the account users in alphabetic order 

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeC1 = c1.getTitular().getNome(); //First, we are going to get the names to be compared.  
		String nomeC2 = c2.getTitular().getNome();
		return nomeC1.compareTo(nomeC2); // We have a method at the String class that does just that, compare one string with the other, alphabetically 
		
	}
	
}



class NumeroContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
// Simplifying the code commented below using one string. 
    	
    	
    	//method3
    	return Integer.compare(c1.getNumero(), c2.getNumero()); //I can also use the method present at the class wrapper Integer. 
    	
    	
    	
    	
    	//method2	
//    	return c1.getNumero() - c2.getNumero(); // The result of this will return me 0 if equals, a negative, if c1 is less than c2 and a positive the other way around. 
    	
    	
    	//method1	
//            if(c1.getNumero() < c2.getNumero()) {
//                return -1;
//            }
//
//            if(c1.getNumero() > c2.getNumero()) {
//                return 1;
//            }
//
//        return 0;
    }
}