package br.com.brunei.sefaz.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brunei.sefaz.model.Usuario;
import br.com.brunei.sefaz.repos.UsuarioRepository;
import br.com.brunei.sefaz.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping("/usuario")
	public List<Usuario> getUsuatios() {
		return repository.findAll();
	}
	
	@PostMapping("/usuario")
	public void criarUsuario(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
}
