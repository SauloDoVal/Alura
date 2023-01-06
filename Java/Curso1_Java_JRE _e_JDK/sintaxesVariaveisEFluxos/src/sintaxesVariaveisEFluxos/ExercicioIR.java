package sintaxesVariaveisEFluxos;

public class ExercicioIR {

	public class TesteIR {

		public static void main(String[] args) {

			double salario = 3300.0;

			if (salario >= 1900.00 && salario <= 2800.00) {
				double deducao = 142;
				double salarioMenosImposto = salario - deducao;
				System.out.println( "O seu salário é de " + salario + " e a sua dedução pode ser de até   " + deducao + ". Depois da dedução o seu salário é de " + salarioMenosImposto);

			} else if (salario >= 2800.01 && salario <= 3751.00) {
				double deducao = 350;
				double salarioMenosImposto = salario - deducao;
				System.out.println( "O seu salário é de " + salario + " e a sua dedução pode ser de até  " + deducao + ". Depois da dedução o seu salário é de " + salarioMenosImposto  );

			} else if (salario >= 3751.01 && salario <= 4664.00) {
				double deducao = 636;
				double salarioMenosImposto = salario - deducao;
				System.out.println( "O seu salário é de " + salario + "e a sua dedução pode ser de até   " + deducao + ". Depois da dedução o seu salário é de " + salarioMenosImposto  );


			}
			
		

		}
	}
}