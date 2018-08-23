class Exercicio313 {
	
    public static void main (String[] args) {
		
		long fatorial = 1;
		int valor = 20;
		
	    for (int n = 1; n <= valor; n++) {
			fatorial *= n;
			System.out.println("fatorial de " + n + ": " + fatorial);
		}		
	}
}