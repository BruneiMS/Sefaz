package br.com.brunei.sefaz.model;

import java.util.ArrayList;
import java.util.List;

import br.com.brunei.sefaz.model.Telefone;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String senha;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Telefone> telefone = new ArrayList<Telefone>();
	
	public void addTelefone(Telefone telefone, Integer ddd, String numero, String tipo) {
		Telefone telefone1 = new Telefone(ddd, numero, tipo);
		telefone.add(telefone1);
	}
	
	public Usuario() {}

	public Usuario(String nome, String email, String senha, List<Telefone> telefone) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		
		ArrayList<Telefone> tenelfones = new ArrayList<Telefone>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefone="
				+ telefone + "]";
	}
}
