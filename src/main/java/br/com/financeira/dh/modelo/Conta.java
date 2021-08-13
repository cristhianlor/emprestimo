package br.com.financeira.dh.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int agenciaConta;
	private String numeroConta;
	@ManyToOne
	private Cliente cliente;
	
	public Conta() {
		
	}

	public Conta(int agenciaConta, String numeroConta, Cliente cliente) {
		this.agenciaConta = agenciaConta;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
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

	public Cliente getCliente() {
		return cliente;
	}

}
