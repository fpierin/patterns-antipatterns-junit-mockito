package com.wordpress.oreboladodeturing.patterns;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Felipe Pierin <felipe.pierin@yahoo.com.br>
 * 
 */
public class AssercaoMultiplaDeveria {

	private static final String INTEL = "Intel";
	private static final String HP = "HP";
	private static final String HP7781_201_ADDS = "HP7781-201-ADDS";
	private Notebook notebook;

	/*
	 * Quando um teste possui muitas verificações, temos um indicio que define que ele está testando muito mais do que deveria.
	 * Por exemplo, ao se testar um builder de um objeto precisamos verificar cada um dos métodos dele.
	 */
	@Before
	public void aposDefinirTodasAsVariaveisNecessariasParaTestarUmComportamento() throws Exception {
		this.notebook = Notebook.novo()
				.numeroDeSerie(HP7781_201_ADDS)
				.marca(HP)
				.processador(INTEL)
				.cria();
	}

	@Test
	public void verificarSeAVariavelDeNumeroDeSerieEncontradaDoObjetoEhAVariavelEsperada() throws Exception {
		assertThat(notebook.numeroDeSerie, is(HP7781_201_ADDS));
	}

	@Test
	public void verificarSeAVariavelDeMarcaEncontradaDoObjetoEhAVariavelEsperada() throws Exception {
		assertThat(notebook.marca , is(HP));
	}

	@Test
	public void verificarSeAVariavelDeProcessadorEncontradaDoObjetoEhAVariavelEsperada() throws Exception {
		assertThat(notebook.processador , is(INTEL));
	}

}
