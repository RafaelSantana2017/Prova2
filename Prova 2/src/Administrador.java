
public class Administrador extends Empregador{
	
	double salario;
	int ajudasDeCusto = 750;
	
	Administrador(){
		
	}
	
	double obterLucro(){
		
		salario = ajudasDeCusto + getSalario() ;
			
			return salario;
	}

}
	 