package br.senai.sp.cotia.hellospring.dao;
//conecta ao banco de dados

import java.sql.Connection;
import java.sql.DriverManager;

import javax.management.RuntimeErrorException;

public class ConnectionFactory {
	private static final String USUARIO = "root";
	private  static final String SENHA = "";
	
	public static Connection conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//varivel para o drive do conector do banco de dados
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/minhadatabase", USUARIO , SENHA);
			return conexao;
		}catch	(Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
