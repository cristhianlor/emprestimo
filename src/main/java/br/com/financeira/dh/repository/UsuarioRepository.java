package br.com.financeira.dh.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.financeira.dh.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Optional<Usuario> findByEmail(String email);
	
	
}
