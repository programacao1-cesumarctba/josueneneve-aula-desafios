package com.github.josueneneve.classes;

public class ContaEspecial extends Conta {

	private double juros;
	private double resultJuros;
	
	public ContaEspecial(double juros) {
		this.juros = juros; 	
	}
	
	public double getResultJuros() {
		return resultJuros;
	}

	private void setResultJuros(double resultJuros) {
		this.resultJuros = resultJuros;
	}

	public double getJuros() {
		return juros;
	}

	private void setJuros(double juros) {
		this.juros = juros;
	}

	public void emprestimo(double valor) {
		double totalSaldo = super.getSaldo() + valor;
		this.setJuros(valor + (valor * this.juros));
		double result = this.getJuros() - valor;
		this.setResultJuros(result);
		super.depositar(totalSaldo);
	}

	@Override
	public String toString() {
		return "Nome : " + this.getTitular() + " |" +
			   " Número : " + this.getNumero() + " |" +
			   " Saldo: R$ " + String.format("%.2f", this.getSaldo()) + " |" +
			   " Juros: R$ " + String.format("%.2f", this.getResultJuros());
				
	}
}
