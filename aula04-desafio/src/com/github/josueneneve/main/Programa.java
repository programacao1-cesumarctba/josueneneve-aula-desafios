package com.github.josueneneve.main;

import com.github.josueneneve.classes.ContaEspecial;
import com.github.josueneneve.classes.ContaSalario;

public class Programa {

	public static void main(String[] args) {
		
		try {
			
			ContaSalario contaSalario = new ContaSalario();
			contaSalario.setTitular("Josué Nenevê");
			contaSalario.setNumero("12345");
			contaSalario.setEmpresa("Americana");
			contaSalario.depositarContaSalario(100d);
			contaSalario.depositarContaSalario(100d);
			// contaSalario.depositarContaSalario(100d);
			
			System.out.println(contaSalario);
			
			ContaEspecial contaEspecial = new ContaEspecial(0.15);
			contaEspecial.setTitular("Josué Nenevê");
			contaEspecial.setNumero("12345");
			contaEspecial.depositar(1000d);
			contaEspecial.emprestimo(2200d);
			
			System.out.println(contaEspecial);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}

}
