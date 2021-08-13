package br.com.financeira.dh.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Proposta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate dataContratacao;
	private Integer quantidadeParcelas;
	private BigDecimal valor;
	private BigDecimal taxaJuros;
	private boolean status;

	@OneToMany(mappedBy = "proposta", cascade = CascadeType.ALL)
	private List<Parcela> parcelas;

	public Proposta(LocalDate dataContratacao, Integer quantidadeParcelas, BigDecimal valor, BigDecimal taxaJuros,
			boolean status, List<Parcela> parcelas) {
		this.dataContratacao = dataContratacao;
		this.quantidadeParcelas = quantidadeParcelas;
		this.valor = valor;
		this.taxaJuros = taxaJuros;
		this.status = status;
		this.parcelas = parcelas;
	}

	public Proposta() {

	}

	public Integer getId() {
		return id;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public BigDecimal getTaxaJuros() {
		return taxaJuros;
	}

	public boolean isStatus() {
		return status;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

}
