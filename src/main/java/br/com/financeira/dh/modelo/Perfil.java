package br.com.financeira.dh.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String senha;
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Perfil> perfis = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Perfil(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

}
