import java.util.Date;

class Conta {

    private String titular;
	private int numero;
	private int agencia;
	private int banco;
	private Data dataAbertura;
	private double saldo = 0;
	
	public Conta (String titular) {
		this.titular = titular;
	}
	
	public Conta () {
		this("Klecius");
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
	    return this.numero;	
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getBanco() {
		return this.banco;
	}
	
	public void setBanco(int banco) {
		this.banco = banco;
	}
	
	public String getDataAbertura() {
		return this.dataAbertura.getFormatada();
	}
	
	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean deposita(double valor) {
		if (valor <= 0) {
			System.out.println("Não foi possível realizar o depósito. Valor menor ou igual a zero.");
			return false;
		} else {
	        this.saldo = this.saldo + valor;
			return true;
		}
	}
	
	public boolean saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
			return false;
		} else {
	        this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	public double calculaRendimento() {
		return this.saldo * 0.1;
	}
}