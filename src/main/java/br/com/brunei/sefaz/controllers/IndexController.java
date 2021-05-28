package br.com.brunei.sefaz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.brunei.sefaz.model.Telefone;
import br.com.brunei.sefaz.model.Usuario;
import br.com.brunei.sefaz.service.UsuarioService;

@Controller
public class IndexController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("")
	public String carregaIndex() {				
		usuarioService.buscaTodos();
		
		return "index";
	}
}
