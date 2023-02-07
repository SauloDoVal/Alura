package br.com.alura;

import java.util.TreeSet;

public class TestaRecibo {
	public static void main(String[] args) {
		
		
		Recibo rec1 = new Recibo(01,29.30,"Supermercado");
		Recibo rec2 = new Recibo(02,35.20,"Restaurante");
		Recibo rec3 = new Recibo(03,10.53,"Padaria");
		
		
		
		
		TreeSet<Recibo> arvoreDeRecibos = new TreeSet<>();
		arvoreDeRecibos.add(rec1);
		arvoreDeRecibos.add(rec2);
		arvoreDeRecibos.add(rec3);

		System.out.println(arvoreDeRecibos);
	}

}



// A história do TreeSet é, vc tem que estabelecer como esse encadiamento em formato de árvore vai funcionar, em geral implementando um comparable... como foi feito na classe RECIBO. 