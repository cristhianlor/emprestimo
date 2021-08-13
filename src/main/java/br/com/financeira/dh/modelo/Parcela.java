package br.com.financeira.dh.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Parcela {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer numeroParcela;
	private LocalDate dataParcela;
	private String status;
	@ManyToOne
	private Proposta proposta;

	public Parcela(Integer numeroParcela, LocalDate dataParcela, String status, Proposta proposta) {
		this.numeroParcela = numeroParcela;
		this.dataParcela = dataParcela;
		this.status = status;
		this.proposta = proposta;
	}

	public Parcela() {

	}

	public Integer getId() {
		return id;
	}

	public Integer getNumeroParcela() {
		return numeroParcela;
	}

	public LocalDate getDataParcela() {
		return dataParcela;
	}

	public String getStatus() {
		return status;
	}

	public Proposta getProposta() {
		return proposta;
	}

}
