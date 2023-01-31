package br.com.byteBank.BBHConta.modelo;

public class GuardadorDeRefs {
	
	private Object[] refs; 
	private int espacoUtilizado; 
	
	
	public GuardadorDeRefs() {
		this.refs = new Object[10];
		this.espacoUtilizado = 0;
		
	}
	
	
	public void addRef(Object ref) {
		this.refs[this.espacoUtilizado] = ref;
		this.espacoUtilizado++;
	}
	
	public int getEspacoUtilizado(){
		return this.espacoUtilizado;
	}
	
	public Object getRef(int pos) {
		return this.refs[pos];
	}
	
	
	

}
