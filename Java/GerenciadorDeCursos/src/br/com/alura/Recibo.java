package br.com.alura;

public class Recibo implements Comparable<Recibo>{
	
	private int numero; 
	private double valor; 
	private String origem; 
	
	
	
	public Recibo(int numero, double valor, String origem) {

	this.numero = numero; 
	this.valor = valor; 
	this.origem = origem; 
	
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getOrigem() {
		return origem;
	}


	@Override
	public int compareTo(Recibo recibo) {
		return Integer.compare(this.numero, recibo.numero);
	}
	
	
	@Override
	public String toString() {
		
		return  "[ Origem do gasto :" + this.origem + " , Valor: " + this.valor + " , Numero do Recibo: " + this.numero;
	}
	

}
