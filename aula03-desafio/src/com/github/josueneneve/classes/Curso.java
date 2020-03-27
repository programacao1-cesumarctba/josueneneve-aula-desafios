package com.github.josueneneve.classes;

public class Curso {
	private String nome;
	private String professor;
	private String tema;
	private Double valor = 0d;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Double getValor() {
		return valor;
	}

	private void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void depositar(double valor) throws Exception {
		if ((valor > 0) && (valor < 1000)) {
			setValor(valor + getValor());
		} else {
			throw new Exception("valor inválido!");
		}
	}
	
}
