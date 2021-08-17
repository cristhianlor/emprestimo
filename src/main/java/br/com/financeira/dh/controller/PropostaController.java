package br.com.financeira.dh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeira.dh.dto.PropostaInputDto;
import br.com.financeira.dh.modelo.Proposta;
import br.com.financeira.dh.repository.ClienteRepository;
import br.com.financeira.dh.repository.PropostaRepository;

@RestController
@RequestMapping("/proposta")
public class PropostaController {

	@Autowired
	private PropostaRepository propostaRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping
	public ResponseEntity<Proposta> salvar(@RequestBody PropostaInputDto propostaInputDto) {
		
		Proposta proposta1 = propostaInputDto.converte(clienteRepository);
		
		Proposta proposta = propostaRepository.save(proposta1);

		return ResponseEntity.status(HttpStatus.CREATED).body(proposta);
	}

}
