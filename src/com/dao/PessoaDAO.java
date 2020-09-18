package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.ConexaoHSQLDB;
import com.entity.Pessoa;

public class PessoaDAO extends ConexaoHSQLDB {
	final String SQL_INSERT_PESSOA = "INSERT INTO PESSOA(NOME, EMIAL) VALUES ( ?, ?)";
	final String SQL_SELECT_PESSOA = "SELECT * FROM PESSOA";
	final String SQL_SELECT_PESSOA_ID = "SELECT * FROM PESSOA WHERE ID = ?";
	final String SQL_ALTERA_PESSOA = "UPDATE PESSOA SET NOME=?, EMIAL=? WHERE ID = ?";
	
	public int inserir(Pessoa pessoa) {
		int quantidade = 0;

		try (Connection connection = this.conectar();
				PreparedStatement pst = connection.prepareStatement(SQL_INSERT_PESSOA);) {
			pst.setString(1, pessoa.getNome());
			pst.setString(2, pessoa.getEmail());
			quantidade = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return quantidade;
	}
	
	
	
	public List<Pessoa> listAll(){
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		try (Connection connection = this.conectar();
				PreparedStatement pst = connection.prepareStatement(SQL_SELECT_PESSOA);){

			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				Pessoa pessoa = new Pessoa();
				
				pessoa.setId(rs.getInt("ID"));
				pessoa.setNome(rs.getString("NOME"));
				pessoa.setEmail(rs.getString("EMIAL"));
				
				listaPessoas.add(pessoa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaPessoas;
	}



	public Pessoa findByID(int id) {
		Pessoa pessoa = null;
		try (Connection connection = this.conectar();
				PreparedStatement pst = connection.prepareStatement(SQL_SELECT_PESSOA_ID);){

			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				pessoa = new Pessoa();
				
				pessoa.setId(rs.getInt("ID"));
				pessoa.setNome(rs.getString("NOME"));
				pessoa.setEmail(rs.getString("EMIAL"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pessoa;
	}



	public int alterar(Pessoa pessoa) {
		int quantidade = 0;

		try (Connection connection = this.conectar();
				PreparedStatement pst = connection.prepareStatement(SQL_ALTERA_PESSOA);) {
			pst.setString(1, pessoa.getNome());
			pst.setString(2, pessoa.getEmail());
			pst.setInt(3, pessoa.getId());
			quantidade = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return quantidade;
	}

	

}
