package br.com.financeira.dh.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.com.financeira.dh.modelo.Parcela;

public class PropostaDto {

	private Integer id;
	private LocalDate dataContratacao;
	private Integer quantidadeParcelas;
	private BigDecimal valor;
	private BigDecimal taxaJuros;
	private boolean status;
	private List<Parcela> parcelas;

	public PropostaDto(Integer id, LocalDate dataContratacao, Integer quantidadeParcelas, BigDecimal valor,
			BigDecimal taxaJuros, boolean status, List<Parcela> parcelas) {
		this.id = id;
		this.dataContratacao = dataContratacao;
		this.quantidadeParcelas = quantidadeParcelas;
		this.valor = valor;
		this.taxaJuros = taxaJuros;
		this.status = status;
		this.parcelas = parcelas;
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
