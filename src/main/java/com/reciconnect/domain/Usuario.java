package com.reciconnect.domain;
import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
	
	
	@Id
	private String email;
	@Column
	private String nome;
	@Column
	private String senha;
	@Column
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
