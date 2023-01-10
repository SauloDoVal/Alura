package ByteBank;

public class TesteFuncionário {
	
	public static void main(String[] args) {
		
		GerenteCerto nico = new GerenteCerto();
		nico.setNome("Nico Alemão");
		nico.setCpf("100.200.300-45");
		nico.setSalario(2600.00);
		
		
		System.out.println(nico.getNome());
		
		System.out.println(nico.getBonus());
		
		
		
		
	}

}
