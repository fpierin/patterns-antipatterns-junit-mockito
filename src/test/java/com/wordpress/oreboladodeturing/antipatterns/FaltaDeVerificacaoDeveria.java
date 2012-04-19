package com.wordpress.oreboladodeturing.antipatterns;

import org.junit.Test;

public class FaltaDeVerificacaoDeveria {

	/*
	 * Nesta situação o teste está vazio e portanto nada está sendo verificado.
	 */
	@Test
	public void verificaroComportamentoXDeUmMetodoY(){
		// TODO
	}

	/*
	 * Nesta situação o teste está definido, mas não há verificações.
	 */
	@Test
	public void verificaroComportamentoXDeUmMetodoZ(){
		new FaltaDeVerificacao().metodoZ();
	}

}
