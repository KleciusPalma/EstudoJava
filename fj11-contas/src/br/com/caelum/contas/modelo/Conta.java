package br.com.caelum.contas.modelo;

public abstract class Conta {
	private String titular;
	private int numero;
	private String agencia;
    protected double saldo;
    
    public abstract String getTipo();/* {
    	return "Conta";
    }*/
    
    public String getTitular() {
    	return titular;
    }
    
    public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
    	this.saldo += valor;
    }
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
}
