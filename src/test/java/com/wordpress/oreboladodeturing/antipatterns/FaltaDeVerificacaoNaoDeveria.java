package com.wordpress.oreboladodeturing.antipatterns;

import org.junit.Test;

/**
 * 
 * @author Felipe Pierin <felipe.pierin@yahoo.com.br>
 * 
 */
public class FaltaDeVerificacaoNaoDeveria {

	/*
	 * Nesta situação o teste está vazio e portanto nada está sendo verificado.
	 * Isso pode comprometer a qualidade do código, afinal, nada é testado e mesmo assim o código passará sem falhas.	 *
	 */
	@Test
	public void definirUmMetodoVazioParaVerificarComportamentoXDeUmMetodoY(){
		// TODO
	}

	/*
	 * Nesta situação o teste está definido, mas não há verificações.
	 * Isso pode comprometer a qualidade do código, afinal, nada é testado e mesmo assim o código passará sem falhas.
	 */
	@Test
	public void definirUmMetodoSemVerificacoesParaTestarComportamentoXDeUmMetodoZ(){
		new FaltaDeVerificacao().metodoZ();
	}

}