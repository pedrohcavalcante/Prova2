package br.imd.modelo;

public class Empregado extends Pessoa{
	private Setor setor;
	private double salarioBase;
	private int imposto;
	
	public Empregado(String nome, String endereço, String telefone, String sexo, int anoNascimento, Setor setor, 
			double salarioBase, int imposto) {
		super(nome, endereço, telefone, sexo, anoNascimento);
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		// TODO Auto-generated constructor stub
	}
	
	public double calcularSalario(){
		return salarioBase - (salarioBase * imposto/100);
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	
}
