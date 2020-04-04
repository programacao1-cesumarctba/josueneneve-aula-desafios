package com.github.josueneneve.classes;

public class Conta {

	private String titular;
	private String numero; // tem que ser 5 digitos
	private Double saldo = 0d;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) throws Exception {
		if (numero.length() == 5) {
			this.numero = numero;
		} else {
			throw new Exception("Número de conta invalida");
		}
	}

	public Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		setSaldo(valor + this.getSaldo());
	}

}
