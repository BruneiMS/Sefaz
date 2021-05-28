package br.com.brunei.sefaz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Telefone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private Integer ddd;
	@Column(nullable = false)
	private String numero;
	@Column(nullable = false)
	private String tipo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("usuarioId")
	private Usuario usuario;
	
	public Telefone() {}

	public Telefone(Integer ddd, String numero, String tipo) {
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", ddd=" + ddd + ", numero=" + numero + ", tipo=" + tipo + "]";
	}

	public void add(Telefone telefone1) {
		// TODO Auto-generated method stub
		
	}

}
