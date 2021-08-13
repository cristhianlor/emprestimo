package br.com.financeira.dh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.financeira.dh.modelo.Proposta;

@Repository
public interface PropostaRepository extends JpaRepository<Proposta, Integer>{

}
