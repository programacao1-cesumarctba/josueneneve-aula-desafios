package com.github.josueneneve.classes;

public class ContaSalario extends Conta {
	
	private String empresa;
	private int quantidade;
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	private int getQuantidade() {
		return quantidade;
	}

	private void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void depositarContaSalario(double valor) throws Exception {
		if (quantidade < 2) {
			this.depositar(valor);
			setQuantidade(this.getQuantidade() + 1);
		} else {
			throw new Exception("Não pode realizar mais deposito.");
		}
	}
	
	@Override
	public String toString() {
		return "Nome : " + this.getTitular() + " |" +
			   " Número : " + this.getNumero() + " |" +
			   " Empresa: " + this.getEmpresa() + " |" +
			   " Saldo: R$ " + String.format("%.2f", this.getSaldo());
	}
	
}
