package br.com.financeira.dh.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Proposta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "DT_CONTRATACAO", nullable = false)
	private LocalDate dataContratacao;
	@Column(name = "QTD_PARCELA", nullable = false)
	private Integer quantidadeParcelas;
	@Column(name = "VLR_CONTRATADO", nullable = false) // m = 100000 x (1 + 0,02) * 4
	private BigDecimal valor = BigDecimal.ZERO;
	@Column(name = "TX_JUROS", nullable = false)
	private BigDecimal taxaJuros = BigDecimal.ZERO;
	private boolean status;
	private BigDecimal montante = BigDecimal.ZERO;
	@JsonIgnore
	@OneToMany(mappedBy = "proposta", cascade = CascadeType.ALL)
	private List<Parcela> parcelas;
	@JsonIgnore
	@ManyToOne
	private Cliente cliente;

	public Proposta(Integer quantidadeParcelas, BigDecimal valor, BigDecimal taxaJuros, boolean status,
			Cliente cliente) {
		this.dataContratacao = LocalDate.now();
		this.quantidadeParcelas = quantidadeParcelas;
		this.valor = valor;
		this.taxaJuros = taxaJuros;
		this.status = status;
		this.cliente = cliente;
		this.montante = calcula();

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

	private BigDecimal calcula() {
		
		BigDecimal jurosx = BigDecimal.valueOf(1).add(taxaJuros);
		
		BigDecimal montante = jurosx.pow(4).multiply(valor); 
		
		return montante;
	}

	public BigDecimal getMontante() {

		return montante.setScale(2,RoundingMode.HALF_UP);
	}

}
