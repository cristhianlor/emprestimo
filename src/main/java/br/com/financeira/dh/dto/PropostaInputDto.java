package br.com.financeira.dh.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.financeira.dh.modelo.Proposta;
import br.com.financeira.dh.repository.ClienteRepository;

public class PropostaInputDto {

	private Integer quantidadeParcelas;
	private LocalDate dataContratacao;
	private BigDecimal valor;
	private BigDecimal taxaJuros;
	private boolean status;
	private Integer clienteId;

	public PropostaInputDto(Integer quantidadeParcelas, LocalDate dataContratacao, BigDecimal valor,
			BigDecimal taxaJuros, boolean status, Integer clienteId) {

		this.quantidadeParcelas = quantidadeParcelas;
		this.dataContratacao = dataContratacao;
		this.valor = valor;
		this.taxaJuros = taxaJuros;
		this.status = status;
		this.clienteId = clienteId;

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

	public Integer getClienteId() {
		return clienteId;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public Proposta converte(ClienteRepository clienteRepository) {
		return new Proposta(quantidadeParcelas, dataContratacao, valor, taxaJuros, status, clienteRepository.getById(clienteId));
	}

}
