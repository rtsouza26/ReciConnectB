package com.reciconnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.reciconnect.domain.Usuario;
import com.reciconnect.service.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")


public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService=usuarioService;
	}
	
	@PostMapping(value="/usuario")
	
	public Usuario createUsuario(@RequestBody Usuario usuario) throws Exception {
		return this.usuarioService.create(usuario);
	}
	
	@GetMapping("/usuarios")
	
	public Iterable<Usuario> listaUsuarios(){
		return this.usuarioService.readAll();
	}
	@GetMapping("/usuario/{email}")
	
	public Usuario usuarioUnico(@PathVariable(value="email") String email) {
		return this.usuarioService.read(email);
	
		
	}

}
