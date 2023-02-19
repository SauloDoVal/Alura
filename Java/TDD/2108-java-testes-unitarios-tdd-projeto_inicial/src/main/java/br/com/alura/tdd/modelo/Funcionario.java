package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;

	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void reajustarSalario(BigDecimal reajuste) {
		this.salario = this.salario.add(reajuste);
		arredondarSalario();
	}
	// O método arredondar salário é private, como eu faço para poder testat ele ???
	// RESPOSTA: Método privado vc não testa, se ele é private é pq ele é um método utilitario de uma classe, que vai ser usado em outro método.
	//Mudar para public é uma má prática.
	private void arredondarSalario() {
		this.salario = this.salario.setScale(2, RoundingMode.HALF_UP);
	}
}
