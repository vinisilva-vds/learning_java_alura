class fatorial{

	public static void main(String [] args) {
	
	long fatorial = 1L;

	for (long numero = 1L; numero <= 40; numero ++){
		
		fatorial *= numero;
		System.out.println("Fatorial de "+numero+"=" +fatorial );
	}

	}
}
