
public class Fornecedor extends Pessoa {
	
	private double saldo;
	private double creditoMaximo;
	private double valorEmDivida;
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getCreditoMaximo() {
		return creditoMaximo;
	}
	public void setCreditoMaximo(double creditoMaximo) {
		this.creditoMaximo = creditoMaximo;
	}
	public double getValorEmDivida() {
		return valorEmDivida;
	}
	public void setValorEmDivida(double valorEmDivida) {
		this.valorEmDivida = valorEmDivida;
	}
	
	Fornecedor(){
		
	}
		
	double obterLucro(){
		
	saldo = creditoMaximo - valorEmDivida;
		
		return saldo;
		
	}
	
	

}
