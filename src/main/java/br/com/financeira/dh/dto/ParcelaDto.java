package br.com.financeira.dh.dto;

import java.time.LocalDate;

public class ParcelaDto {

	private Integer id;
	private Integer numeroParcela;
	private LocalDate dataParcela;
	private String status;
	private Integer propostaId;

	public ParcelaDto(Integer id, Integer numeroParcela, LocalDate dataParcela, String status, Integer propostaId) {
		this.id = id;
		this.numeroParcela = numeroParcela;
		this.dataParcela = dataParcela;
		this.status = status;
		this.propostaId = propostaId;
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

	public Integer getIdProposta() {
		return propostaId;
	}

}
