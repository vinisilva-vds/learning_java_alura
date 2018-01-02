class Funcionario {
	String nome;
	String dpto;
	double salario;
	String dataEntrada;
	String rg;

	void recebeAumento (double parametroAjusteSal){
		this.salario = salario *parametroAjusteSal; 	
	}

	double calculaGanhoAnual(){
		return this.salario * 12;	
	}

// teste commit


}
