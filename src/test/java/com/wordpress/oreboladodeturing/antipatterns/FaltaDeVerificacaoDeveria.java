package com.wordpress.oreboladodeturing.antipatterns;

import org.junit.Test;

public class FaltaDeVerificacaoDeveria {

	/*
	 * Nesta situação o teste está vazio e portanto nada está sendo verificado.
	 * Isso pode comprometer a qualidade do código, afinal, nada é testado e mesmo assim o código passará sem falhas.	 *
	 */
	@Test
	public void verificaroComportamentoXDeUmMetodoY(){
		// TODO
	}

	/*
	 * Nesta situação o teste está definido, mas não há verificações.
	 * Isso pode comprometer a qualidade do código, afinal, nada é testado e mesmo assim o código passará sem falhas.
	 */
	@Test
	public void verificaroComportamentoXDeUmMetodoZ(){
		new FaltaDeVerificacao().metodoZ();
	}

}
