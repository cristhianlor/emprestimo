package br.com.financeira.dh;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.financeira.dh.modelo.Cliente;
import br.com.financeira.dh.modelo.Proposta;

public class PropostaTeste {
	
	@Test
	public void calculaMontanteTeste() {
		
		Cliente cliente = new Cliente();
		
				
		Proposta proposta = new Proposta(4, BigDecimal.valueOf(10000), BigDecimal.valueOf(0.02), true, cliente);
		
		assertEquals(BigDecimal.valueOf(10824.32), proposta.getMontante());
		
	}
	
}
