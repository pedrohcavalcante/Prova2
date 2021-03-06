package br.imd.modelo;

public class Pessoa {
	private String nome;
	private  String enderešo;
	private String telefone;
	private String sexo;
	private int anoNascimento;
	public Pessoa(String nome, String enderešo, String telefone, String sexo, int anoNascimento) {
		this.nome = nome;
		this.enderešo = enderešo;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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
