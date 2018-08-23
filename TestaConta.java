class TestaConta {
		
	public static void main (String[] args) {
		
		Conta minhaConta = new Conta("Klecius");
		/*minhaConta.setTitular("Klecius");*/
		minhaConta.setNumero(19646);
		minhaConta.setAgencia(2755);
		minhaConta.setBanco(1);
		
		Data data = new Data();
		minhaConta.setDataAbertura(data);

		double valorDeposito = 1250;
		double valorSaque = 300;

		System.out.println("Titular: " + minhaConta.getTitular());
		System.out.println("Número: " + minhaConta.getNumero());
		System.out.println("Agência: " + minhaConta.getAgencia());
		System.out.println("Banco: " + minhaConta.getBanco());
		System.out.println("Abertura: " + minhaConta.getDataAbertura());
		System.out.println("Saldo: " + minhaConta.getSaldo());
		
		if (minhaConta.deposita(valorDeposito) == true)
		    System.out.println("Depósito: " + valorDeposito + " Saldo Atual: " + minhaConta.getSaldo());

		if (minhaConta.saca(valorSaque) == true)
			System.out.println("Saque: " + valorSaque + " Saldo Atual: " + minhaConta.getSaldo());
		
		System.out.println("Rendimento: " + minhaConta.calculaRendimento());
	}
}