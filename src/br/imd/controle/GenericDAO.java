package br.imd.controle;

import br.imd.modelo.*;

public interface GenericDAO {
	public void inserirPessoa(Pessoa pessoa);
	public void inserirFornecedor(Fornecedor fornecedor);
	public void inserirEmpregado(Empregado empregado);
	public void inserirSetor(Setor setor);
	
}
