package br.com.financeira.dh.dto;

public class ContaDto {

	private Integer id;
	private int agenciaConta;
	private String numeroConta;
	private Integer clienteId;

	public ContaDto(Integer id, int agenciaConta, String numeroConta, Integer clienteId) {
		this.id = id;
		this.agenciaConta = agenciaConta;
		this.numeroConta = numeroConta;
		this.clienteId = clienteId;
	}

	public Integer getId() {
		return id;
	}

	public int getAgenciaConta() {
		return agenciaConta;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public Integer getIdCliente() {
		return clienteId;
	}

}
