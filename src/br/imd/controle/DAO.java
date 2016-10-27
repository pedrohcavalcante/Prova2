package br.imd.controle;

import java.util.ArrayList;

import br.imd.modelo.*;

public class DAO implements GenericDAO{
	private ArrayList<Pessoa> arrayPessoa = new ArrayList<Pessoa>();
	private ArrayList<Fornecedor> arrayFornecedor = new ArrayList<Fornecedor>();
	private ArrayList<Empregado> arrayEmpregado = new ArrayList<Empregado>();
	private ArrayList<Setor> arraySetor = new ArrayList<Setor>();
	
	@Override
	public void inserirPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		arrayPessoa.add(pessoa);
	}

	@Override
	public void inserirFornecedor(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		arrayFornecedor.add(fornecedor);
	}

	@Override
	public void inserirEmpregado(Empregado empregado) {
		// TODO Auto-generated method stub
		arrayEmpregado.add(empregado);
	}

	@Override
	public void inserirSetor(Setor setor) {
		// TODO Auto-generated method stub
		arraySetor.add(setor);
	}
	
	public void listarPessoa(Pessoa pessoa){
		
		
		for (Pessoa p : arrayPessoa){
			System.out.println("*****PESSOA*****");
			System.out.println("Nome: " + p.getNome());
			System.out.println("Endereço: " + p.getEndereço());
			System.out.println("Sexo: " + p.getSexo());
			System.out.println("Idade: " + p.calcularIdade(p.getAnoNascimento()));
			System.out.println("Telefone: " + p.getTelefone());
		}
	}
	public void listarEmpregado(){
		
		for (Empregado e : arrayEmpregado){
			System.out.println("*****EMPREGADO*****");
			System.out.println("Nome: " + e.getNome());
			System.out.println("Endereço: " + e.getEndereço());
			System.out.println("Sexo: " + e.getSexo());
			System.out.println("Idade: " + e.calcularIdade(e.getAnoNascimento()));
			System.out.println("Telefone: " + e.getTelefone());
			System.out.println("Salário Líquido: " + e.calcularSalario());
		}
		
	}
	public void listarFornecedor(){
		
		for (Fornecedor f : arrayFornecedor){
			System.out.println("*****FORNECEDOR*****");
			System.out.println("Nome: " + f.getNome());
			System.out.println("Endereço: " + f.getEndereço());
			System.out.println("Sexo: " + f.getSexo());
			System.out.println("Idade: " + f.calcularIdade(f.getAnoNascimento()));
			System.out.println("Telefone: " + f.getTelefone());
			System.out.println("Saldo: " + f.obterSaldo());
		}
	}
	
	public void listarSetor(){
		
		for (Setor s : arraySetor){
			System.out.println("*****SETOR*****");
			System.out.println("Código: " + s.getCodigoSetor());
			System.out.println("Descrição: " + s.getDescricaoSetor());
		}
	}
}
