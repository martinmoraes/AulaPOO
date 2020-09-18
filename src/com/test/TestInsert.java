package com.test;

import com.dao.PessoaDAO;
import com.entity.Pessoa;

public class TestInsert {

	
	
	public static void main(String[] args)  {
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		Pessoa pessoa = new Pessoa("MARTIN", "mama@dmdmd");
		int qtde = pessoaDAO.inserir(pessoa);
		System.out.println(qtde);
		

	}
}
