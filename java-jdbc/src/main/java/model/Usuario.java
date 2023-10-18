package model;

public class Usuario {
	private long id;
	private String nome;
	private String email;
	public Usuario(long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	public Usuario() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	
}
