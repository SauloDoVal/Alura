package ByteBank;

public class EditorVideo extends Funcionario {

	public double getBonus() {
		System.out.println("O editor de video está recebendo o seu bonus");
		return super.getBonus() + 666;

	}
}
