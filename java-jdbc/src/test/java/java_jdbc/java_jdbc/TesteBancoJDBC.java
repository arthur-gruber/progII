package java_jdbc.java_jdbc;

import org.junit.Test;

import dao.UsuarioDAO;
import model.Usuario;

public class TesteBancoJDBC {
	@Test


	public void initSalvar() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = new Usuario(4L, "Pedro", "pedro.sobrenome@unoesc.edu.br");
		usuarioDAO.salvar(usuario);
		
	}

}
