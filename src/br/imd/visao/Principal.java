package br.imd.visao;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.imd.controle.*;
import br.imd.modelo.*;

@SuppressWarnings("serial")
public class Principal extends JFrame{
	private static int option = 100000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa ("Pedro", "Rua tal","996064412", "Masculino", 1994 );
		Setor s1 = new Setor(1,"armazem");
		Fornecedor f1 = new Fornecedor("Pedro", "Rua Fornecedor", "996064412", "Masculino", 1994, 25.0, 10.0);
		
		Empregado e1 = new Empregado ("Pedro", "Rua tal", "996064412", "Masculino", 1994,s1, 2000.0, 10);
		DAO d1 = new DAO();
		
		try{
			while (option != 0){
				option = Integer.parseInt(JOptionPane.showInputDialog(""
						+ "Digite 1 para cadastrar Pessoa\n"
						+ "Digite 2 para cadastrar Fornecedor\n"
						+ "Digite 3 paracadastrar Empregado\n"
						+ "Digite 4 para cadastrar Setor\n"
						+ "Digite 5 para listar Pessoas\n"
						+ "Digite 6 para listar Fornecedores\n"
						+ "Digite 7 para listar Empregador\n"
						+ "Digite 8 para listar Setores\n"
						+ "Digite 0 para sair do programa"));
				
				if (option == 1){
					d1.inserirPessoa(p1);
				}else if (option == 2){
					d1.inserirFornecedor(f1);
				}else if(option == 3){
					d1.inserirEmpregado(e1);
				}else if(option == 4){
					d1.inserirSetor(s1);
				}else if(option == 5){
					d1.listarPessoa(p1);
				}else if(option == 6){
					d1.listarFornecedor();
				}else if(option == 7){
					d1.listarEmpregado();
				}else if(option == 8){
					d1.listarSetor();
				}else if(option <= 0){
					System.out.println("Saindo");
					option = 0;
				}else if(option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION){
					System.out.println("Saindo");
				}else{
					System.out.println("Opção não definida");
				}
			}
			
		}catch (NumberFormatException e){
			System.out.println("Formato inválido. Saindo");
		}
	}

}
