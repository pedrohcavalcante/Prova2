package br.imd.modelo;

public class Pessoa {
	private String nome;
	private  String endere�o;
	private String telefone;
	private String sexo;
	private int anoNascimento;
	public Pessoa(String nome, String endere�o, String telefone, String sexo, int anoNascimento) {
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
	}
	
	public int calcularIdade(int ano){
		return 2016-ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
}
