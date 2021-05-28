package br.com.brunei.sefaz.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunei.sefaz.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	public Usuario findByNome(String nome);

}
