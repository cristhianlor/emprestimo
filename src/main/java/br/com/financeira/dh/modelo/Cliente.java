package br.com.financeira.dh.modelo;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpf;
	private LocalDate dataContrato;
	private BigDecimal salario;
	private BigDecimal patrimonio;

	public Cliente(String nome, String cpf, LocalDate dataContrato, BigDecimal salario, BigDecimal patrimonio) {

		this.nome = nome;
		this.cpf = cpf;
		this.dataContrato = dataContrato;
		this.salario = salario;
		this.patrimonio = patrimonio;
	}
	
	public Cliente () {
		
	}

	public boolean verificaTempoServiço() {
		boolean retorno = false;
		LocalDate dataAtual = LocalDate.now();
		Duration duracao = Duration.between(dataAtual, this.dataContrato);
		if (duracao.toDays() > 90) {
			retorno = true;
		}
		return retorno;
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

}
