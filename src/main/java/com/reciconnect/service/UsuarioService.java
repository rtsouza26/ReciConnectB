package com.reciconnect.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reciconnect.DAO.UsuarioDAO;
import com.reciconnect.domain.Usuario;

@Service
public class UsuarioService {

	private UsuarioDAO usuarioDAO;

	@Autowired
	public UsuarioService(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;

	}

	public Usuario create(Usuario usuario) throws Exception {

		if (this.find(usuario.getEmail())) {
			return this.usuarioDAO.save(usuario);

		} else {
			throw new Exception("Usuário já existente");

		}

	}

	public boolean find(String email) {
		Optional<Usuario> usuario = this.usuarioDAO.findById(email);

		if (!usuario.isPresent()) {
			return true;
		} else {
			return false;
		}
	}

	public Iterable<Usuario> readAll() {
		return this.usuarioDAO.findAll();
	}

	public Usuario read(String email) {
		Optional<Usuario> usuario = this.usuarioDAO.findById(email);

		return usuario.get();
	}
}
