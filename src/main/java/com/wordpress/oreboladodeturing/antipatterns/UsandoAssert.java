package com.wordpress.oreboladodeturing.antipatterns;

public class UsandoAssert {

	public UsandoAssert obterMesmoObjeto() {
		return this;
	}

	public String obterObjetoIgual() {
		return "igual";
	}

	public Object obterNull() {
		return null;
	}

	public Object obterNotNull() {
		return new Object();
	}

}
