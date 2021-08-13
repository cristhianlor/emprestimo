package br.com.financeira.dh.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.financeira.dh.modelo.Conta;

public class ClienteDto {

	private Integer id;
	private String nome;
	private String cpf;
	private LocalDate dataContrato;
	private BigDecimal salario;
	private BigDecimal patrimonio;
	private List<Conta> contas = new ArrayList<>();
	private Integer propostaId;

	public ClienteDto(Integer id, String nome, String cpf, LocalDate dataContrato, BigDecimal salario,
			BigDecimal patrimonio, List<Conta> contas, Integer propostaId) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataContrato = dataContrato;
		this.salario = salario;
		this.patrimonio = patrimonio;
		this.contas = contas;
		this.propostaId = propostaId;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public LocalDate getDataContrato() {
		return dataContrato;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public BigDecimal getPatrimonio() {
		return patrimonio;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public Integer getIdProposta() {
		return propostaId;
	}

}
