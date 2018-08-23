package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	@Override
	public void saca(double valor) {
		this.saldo -= (valor + 0.1);
	}
	
    public String getTipo() {
    	//return this.getTipo() + " Corrente";
    	return "Conta Corrente";
    }

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}
