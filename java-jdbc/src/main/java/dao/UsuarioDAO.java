package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexaojdbc.SingleConnection;
import model.Usuario;

public class UsuarioDAO {
	private Connection connection;

	public UsuarioDAO() {
		connection = SingleConnection.getConnection();
	}

	public void salvar(Usuario usuario) {
		String sql = "insert into usuario (id, nome, email) values (?,?,?)";
		try {
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setLong(1, usuario.getId()); // posição e valor
			insert.setString(2, usuario.getNome());
			insert.setString(3, usuario.getEmail());
			insert.execute(); // executa o sql
			connection.commit(); // salva no banco
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}
