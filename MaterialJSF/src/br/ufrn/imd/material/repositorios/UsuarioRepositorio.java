package br.ufrn.imd.material.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.material.dominio.Usuario;

public class UsuarioRepositorio {
	private static List<Usuario> usuarios;
	
	public static Usuario getUsuario(String login, String senha) {
		Usuario usuarioRetorno = null;
		if (usuarios == null) {
			usuarios = new ArrayList<Usuario>();
			
			Usuario usuario = new Usuario("mrayanealves", "mrayanealves");
			usuarios.add(usuario);
		}
		
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
				usuarioRetorno = usuario;
			}
		}
		
		return usuarioRetorno;
	}
}
