package br.imd.modelo;

public class Fornecedor extends Pessoa{
	private double valorCredito;
	private double valorDivida;
	public Fornecedor(String nome, String endereço, String telefone, String sexo, int anoNascimento, double valorCredito,
			double valorDivida) {
		super(nome, endereço, telefone, sexo, anoNascimento);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		// TODO Auto-generated constructor stub
	}
	
	public double obterSaldo(){
		return valorCredito-valorDivida;
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	

}
