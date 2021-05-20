package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Lilian");
		cliente1.setTelefone("11 963186719");
		cliente1.setEmail("lilian.fontan@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("João");
		cliente2.setTelefone("11 999999999");
		cliente2.setEmail("joaodascouves@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
