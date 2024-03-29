package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	//O funcionario recebe uma bonificação de 10% do seu salário, se esta bonidicação for maior que 1000,
	// o funicionario não recebe bonificação.

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionário com Sálario maior que R$10.000,00 não pode receber bonus.");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
