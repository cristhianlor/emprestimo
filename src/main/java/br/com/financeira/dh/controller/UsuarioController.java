package br.com.financeira.dh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeira.dh.modelo.Usuario;
import br.com.financeira.dh.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping()
	public List<Usuario> buscarTodos(){
		return usuarioRepository.findAll();
	}
	
}
