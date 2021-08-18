package br.com.financeira.dh.modelo;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpf;
	@Column(name = "DT_CONTRATO", nullable = false)
	private LocalDate dataContrato;
	@Column(name = "VL_SALARIO", nullable = false)
	private BigDecimal salario = BigDecimal.ZERO;
	@Column(name = "VL_PATRIMONIO", nullable = false)
	private BigDecimal patrimonio = BigDecimal.ZERO;
	@JsonIgnore
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Conta> contas;
	@JsonIgnore
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Proposta> propostas;

	public Cliente(String nome, String cpf, LocalDate dataContrato, BigDecimal salario, BigDecimal patrimonio,
			List<Conta> contas, List<Proposta> propostas) {

		this.nome = nome;
		this.cpf = cpf;
		this.dataContrato = dataContrato;
		this.salario = salario;
		this.patrimonio = patrimonio;
		this.contas = contas;
		this.propostas = propostas;
	}

	public Cliente() {

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

	public List<Conta> getContas() {
		return contas;
	}

	public List<Proposta> getProposta() {
		return propostas;
	}

}
