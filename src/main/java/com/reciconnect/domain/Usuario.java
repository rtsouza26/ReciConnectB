package com.reciconnect.domain;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="TB_USUARIO")
public class Usuario {
	
	
	@Id
	@NotNull
	private String email;
	@Column
	@NotNull
	private String nome;
	@Column
	@NotNull
	private String senha;
	@Column
	@NotNull
	private int avatar;
	
	
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public int getAvatar() {
		return avatar;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setAvatar(int avatar) {
		this.avatar = avatar;
	}
	
	

}
