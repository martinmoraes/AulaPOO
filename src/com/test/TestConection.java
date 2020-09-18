package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.ConexaoHSQLDB;

public class TestConection {

	public static void main(String[] args) {
		ConexaoHSQLDB conn = new ConexaoHSQLDB();
		
		Connection connection = conn.conectar();
				
		//Inserir dados
		final String SQL_INSERT_PESSOA = "INSERT INTO PESSOA(NOME, EMIAL) VALUES ( ?, ?)";
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(SQL_INSERT_PESSOA);
			pst.setString(1, "aaaa");
			pst.setString(2, "aaaa@sdfdsf.sdfsdf");
			int qtde = pst.executeUpdate();
			System.out.println("Qtde inserido: "+ qtde);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Listar todos
		final String SQL_SELECT_PESSOA = "SELECT * FROM PESSOA";
//		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(SQL_SELECT_PESSOA);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("ID");
				String nome = rs.getString("NOME");
				String email = rs.getString("EMIAL");

				System.out.println(id +" "+ nome +" "+email );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
