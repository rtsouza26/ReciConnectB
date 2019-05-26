package com.reciconnect.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reciconnect.DAO.UsuarioDAO;
import com.reciconnect.domain.Usuario;

@Service
public class UsuarioService {
	
	private UsuarioDAO  usuarioDAO;
	
	@Autowired
	public UsuarioService( UsuarioDAO usuarioDAO ) {
		this.usuarioDAO = usuarioDAO;
		
	}
	public boolean Create ( Usuario usuario) throws Exception{
		if(usuario !=null) {
			if(this.find(usuario.getEmail())) {
				 this.usuarioDAO.save(usuario);
				 return true;
			}else {
				throw new Exception("Ususário já existente");
				
			}
		}
		return false;
		
		
	}
	public boolean find( String email) {
		Optional<Usuario> usuario = this.usuarioDAO.findById(email);
		
		if(!usuario.isPresent()) {
			return true;
		}else {
			return false;
		}
	}
}
