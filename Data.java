class Data {
    private int dia;
	private int mes;
	private int ano;
	
	public String getFormatada() {
	    this.dia = 10;
		this.mes = 02;
		this.ano = 1978;
		
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}