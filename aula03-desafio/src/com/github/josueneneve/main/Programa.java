package com.github.josueneneve.main;

import com.github.josueneneve.classes.Curso;

public class Programa {

	public static void main(String[] args) {
		try {
			Curso curso = new Curso();
			
			curso.setNome("Josué Nenevê");
			curso.setProfessor("Maycon");
			curso.setTema("Programaçao");
			
			curso.depositar(100d);
			
			System.out.println(String.format(
					"Nome: %s \n" +
					"Professor: %s \n" +
					"Tema: %s \n" + 
					"Valor: %.2f",
					curso.getNome(),
					curso.getProfessor(),
					curso.getTema(),
					curso.getValor()
			));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
