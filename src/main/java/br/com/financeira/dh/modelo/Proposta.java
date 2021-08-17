package br.com.financeira.dh.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Proposta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate dataContratacao = LocalDate.now();
	private Integer quantidadeParcelas;
	private BigDecimal valor = BigDecimal.ZERO;
	private BigDecimal taxaJuros = BigDecimal.ZERO;
	private boolean status;

	@OneToMany(mappedBy = "proposta", cascade = CascadeType.ALL)
	private List<Parcela> parcelas;
	@ManyToOne
	private Cliente cliente;

	public Proposta(Integer quantidadeParcelas, LocalDate dataContratacao, BigDecimal valor, BigDecimal taxaJuros,
			boolean status, Cliente cliente) {
		
		this.quantidadeParcelas = quantidadeParcelas;
		this.valor = valor;
		this.taxaJuros = taxaJuros;
		this.status = status;
		this.cliente = cliente;
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

	public Cliente getCliente() {
		return cliente;
	}

}
