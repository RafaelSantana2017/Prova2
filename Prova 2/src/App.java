public class App {

	public static void main(String[] args) {

		Empregador em = new Empregador();

		em.setNome("Rafael");
		em.setSexo("Masculino");
		em.setSalario(1000);
		em.setAltura(1.80);
		em.setIdade(17);

		System.out.println(" O nome do empregador � : " + em.getNome());
		System.out.println("O seu sexo � :" + em.getSexo());
		System.out.println(" O seu salario � : " + em.obterLucro());
		System.out.println("Idade : " + em.getIdade());
		System.out.println("Sua altura : " + em.getAltura() + " cm ");

		
		
		
		
		System.out.println("-----------------");
		
		
		Fornecedor f = new Fornecedor();

		f.setNome("Junior");
		f.setCreditoMaximo(2000);
		f.setValorEmDivida(500);
		
		System.out.println("O Nome do Fornecedor : "+ f.getNome());
		System.out.println("O credito maximo � :" + f.getCreditoMaximo());
		System.out.println(" O Valor da divida � : " + f.getValorEmDivida());
		System.out.println("O seu saldo � :" + f.obterLucro());
		
		
		System.out.println("---------------------");
		
		Administrador ad = new Administrador();
		
		ad.setNome("Silvio");
		ad.setSalario(1000);
		
	
		System.out.println("Nome:"+ ad.getNome());
		System.out.println("Salario: "+ ad.obterLucro());

	}

}
