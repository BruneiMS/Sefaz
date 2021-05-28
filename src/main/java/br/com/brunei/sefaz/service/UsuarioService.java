package br.com.brunei.sefaz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brunei.sefaz.model.Usuario;
import br.com.brunei.sefaz.repos.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void insere(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public void delete(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	public Usuario buscaPorNome(String nome) {
		return usuarioRepository.findByNome(nome);			
	}
	
	public List<Usuario> buscaTodos(){
		return usuarioRepository.findAll();
	}
	
	
}
