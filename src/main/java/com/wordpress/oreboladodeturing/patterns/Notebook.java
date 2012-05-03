package com.wordpress.oreboladodeturing.patterns;


public class Notebook {

	public String marca;
	public String numeroDeSerie;
	public String processador;

	public static class NotebookBuilder {
		private final Notebook notebook = new Notebook();

		public NotebookBuilder marca(final String marca) { this.notebook.marca = marca; 	return this; }
		public NotebookBuilder numeroDeSerie(final String numeroDeSerie) { this.notebook.numeroDeSerie = numeroDeSerie;	return this; }
		public NotebookBuilder processador(final String processador) { this.notebook.processador = processador; return this; }

		public Notebook cria() {  return notebook;  }
	}

	public static NotebookBuilder novo() {
		return new NotebookBuilder();
	}

}