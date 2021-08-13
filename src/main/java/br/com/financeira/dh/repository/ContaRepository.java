package br.com.financeira.dh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.financeira.dh.modelo.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer>{

}
