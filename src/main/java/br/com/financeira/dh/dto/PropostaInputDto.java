package br.com.financeira.dh.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.financeira.dh.modelo.Cliente;
import br.com.financeira.dh.modelo.Proposta;
import br.com.financeira.dh.repository.ClienteRepository;

public class PropostaInputDto {

	private Integer quantidadeParcelas;
	private BigDecimal valor;
	private BigDecimal taxaJuros;
	private boolean status;
	private Integer clienteId;

	public PropostaInputDto(Integer quantidadeParcelas, BigDecimal valor,
			BigDecimal taxaJuros, boolean status, Integer clienteId) {

		this.quantidadeParcelas = quantidadeParcelas;
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

	
	public Proposta converte(ClienteRepository clienteRepository) {
		Cliente cliente = clienteRepository.getById(clienteId);
		
		return new Proposta(quantidadeParcelas, valor, taxaJuros, status, cliente);
	}

}
