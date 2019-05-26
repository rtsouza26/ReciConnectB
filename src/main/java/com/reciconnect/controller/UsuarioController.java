package com.reciconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.reciconnect.domain.Usuario;
import com.reciconnect.service.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping("/ucadastro")
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService=usuarioService;
	}
	
	@PostMapping(value="/")
	public void createUsuario(@RequestBody Usuario usuario) throws Exception {
		this.usuarioService.Create(usuario);
	}

}
