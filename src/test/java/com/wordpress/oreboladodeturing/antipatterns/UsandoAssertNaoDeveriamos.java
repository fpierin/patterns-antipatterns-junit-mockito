package com.wordpress.oreboladodeturing.antipatterns;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UsandoAssertNaoDeveriamos {

	@Test
	public void usarOAssertTrueParaVerificarSeDoisObjetosSaoOMesmo() throws Exception {
		final UsandoAssert esperado = new UsandoAssert().obterMesmoObjeto();
		final UsandoAssert encontrado = esperado;
		assertTrue("Objetos deveriam ser os mesmos", esperado == encontrado);
	}

	@Test
	public void usarOAssertTrueParaVerificarSeDoisObjetosSaoIguais() throws Exception {
		final String esperado = new UsandoAssert().obterObjetoIgual();
		final String encontrado = esperado;
		assertTrue("Objetos deveriam ser iguais", esperado.equals(encontrado));
	}

	@Test
	public void usarOAssertTrueParaVerificarSeObjetoEncontradoEhNulo() throws Exception {
		final Object encontrado = new UsandoAssert().obterNull();
		assertTrue("Objeto encontrado deveria ser nulo", encontrado == null);
	}

	@Test
	public void usarOAssertTrueParaVerificarSeObjetoEncontradoEhNaoNulo() throws Exception {
		final Object encontrado = new UsandoAssert().obterNotNull();
		assertTrue("Objeto encontrado deveria ser não nulo", encontrado != null);
	}

}
