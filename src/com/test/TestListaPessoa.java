package com.test;

import java.util.List;

import com.dao.PessoaDAO;
import com.entity.Pessoa;

public class TestListaPessoa {

	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new PessoaDAO().listAll();
		
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}
		
		

	}

}
