package br.com.financeira.dh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeira.dh.modelo.Cliente;
import br.com.financeira.dh.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping
	public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente) {

		Cliente clie = clienteRepository.save(cliente);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(clie);
	}

}
