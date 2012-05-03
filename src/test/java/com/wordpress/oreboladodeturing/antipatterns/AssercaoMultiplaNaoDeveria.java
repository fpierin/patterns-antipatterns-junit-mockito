package com.wordpress.oreboladodeturing.antipatterns;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.wordpress.oreboladodeturing.patterns.Notebook;

/**
 * 
 * @author Felipe Pierin <felipe.pierin@yahoo.com.br>
 * 
 */
public class AssercaoMultiplaNaoDeveria {

	/*
	 * Quando um teste possui muitas verificações, temos um indicio que define que ele está testando muito mais do que deveria.
	 * Por exemplo, ao se testar um builder de um objeto precisamos verificar cada um dos métodos dele.
	 */
	@Test
	public void verificarTodasAsVariaveisDeUmaClasseEmUmSohMetodo() throws Exception {

		final String numeroDeSerie = "HP7781-201-ADDS";
		final String marca = "HP";
		final String processador = "Intel";

		final Notebook notebook = Notebook.novo()
				.numeroDeSerie(numeroDeSerie)
				.marca(marca)
				.processador(processador)
				.cria();

		assertThat(notebook.numeroDeSerie, is(numeroDeSerie));
		assertThat(notebook.marca , is(marca));
		assertThat(notebook.processador , is(processador));
	}

}
