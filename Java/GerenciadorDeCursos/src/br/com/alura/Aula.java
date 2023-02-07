package br.com.alura;

public class Aula implements Comparable <Aula>{
	
	//Para conseguir ordenar as aulas, eu preciso implementar a interface Comparable... pra dizer que um elemento da ArrayList pode ser comparável com outro elemento da ArrayList. 
	// A interface Comparable me faz dar um @Override no método compareTo, onde vai estar a minha lógica de comparação. 
	private String titulo;
	private int tempo; 
	
	
	
	public Aula (String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	

	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Aula: " + this.titulo + " Duração: " + this.tempo + " Minutos] " ;
	}


	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
			}
	
	
	
}
