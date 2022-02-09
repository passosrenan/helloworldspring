package br.senai.sp.cotia.hellospring.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.senai.sp.cotia.hellospring.model.Produto;

// classe q conversa com o bd
public class DaoProduto {
	private Connection conexao;
	//deixa a conexao pronta para fazer as instruções no bd
	public DaoProduto() {
		conexao = ConnectionFactory.conectar();
	}
	//inserindo produto no bd usando "sql"
	public void inserir(Produto produto) {
		String sql = "insert into tb_produto(nome, data_Validade, preco, estoque, tipo_produto)"+"values (?,?,?,?,?)";
		//preparando o comando 
		PreparedStatement inserir;
		try {
			inserir = conexao.prepareStatement(sql);
			inserir.setString(1, produto.getNome());
			inserir.setDate(2, new Date(produto.getDataValidade().getTimeInMillis()));
			inserir.setDouble(3, produto.getPreco());
			inserir.setInt(4, produto.getEstoque());
			inserir.setInt(5, produto.getTipoProduto().ordinal());
			inserir.execute();
			conexao.close();
		} catch (SQLException e)  {
			throw new RuntimeException(e);
			
		}
	}
	
	
}
