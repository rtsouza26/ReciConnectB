package com.reciconnect.DAO;

import org.springframework.data.repository.CrudRepository;

import com.reciconnect.domain.Usuario;

public interface UsuarioDAO  extends CrudRepository<Usuario,String>{

}
