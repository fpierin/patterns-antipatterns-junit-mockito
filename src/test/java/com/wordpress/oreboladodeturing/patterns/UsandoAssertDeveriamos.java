package com.wordpress.oreboladodeturing.patterns;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.wordpress.oreboladodeturing.antipatterns.UsandoAssert;

public class UsandoAssertDeveriamos {

	@Test
	public void usarOAssertSameParaVerificarSeDoisObjetosSaoOMesmo() throws Exception {
		final UsandoAssert esperado = new UsandoAssert().obterMesmoObjeto();
		final UsandoAssert encontrado = esperado;

		assertSame("Objetos deveriam ser os mesmos", esperado, encontrado);
		// Ou melhor ainda.
		assertThat(esperado,  is(encontrado) );
	}

	@Test
	public void usarOAssertEqualsParaVerificarSeDoisObjetosSaoIguais() throws Exception {
		final String esperado = new UsandoAssert().obterObjetoIgual();
		final String encontrado = esperado;

		assertEquals("Objetos deveriam ser os mesmos", esperado, encontrado);
		// Ou melhor ainda.
		assertThat(esperado,  is(encontrado) );
	}

	@Test
	public void usarOAssertTrueParaVerificarSeObjetoEncontradoEhNulo() throws Exception {
		final Object encontrado = new UsandoAssert().obterNull();

		assertNull("Objeto encontrado deveria ser nulo", encontrado);
		// Ou melhor ainda.
		assertThat(encontrado, is(nullValue()));
	}

	@Test
	public void usarOAssertTrueParaVerificarSeObjetoEncontradoEhNaoNulo() throws Exception {
		final Object encontrado = new UsandoAssert().obterNotNull();

		assertNotNull("Objeto encontrado deveria ser nao nulo", encontrado);
		// Ou melhor ainda.
		assertThat(encontrado, is(not(nullValue())));
	}

}
