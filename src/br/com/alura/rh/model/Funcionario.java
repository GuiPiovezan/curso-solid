package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public void atualizarSalario(BigDecimal aumento) {
		this.dadosPessoais.setSalario(aumento);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public String getNome() {
		return dadosPessoais.getNome();
	}

	public String getCpf() {
		return dadosPessoais.getCpf();
	}

	public Cargo getCargo() {
		return dadosPessoais.getCargo();
	}

	public BigDecimal getSalario() {
		return dadosPessoais.getSalario();
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo cargoAtual) {
		this.dadosPessoais.setCargo(cargoAtual);
	}

}
