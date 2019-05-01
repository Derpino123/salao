package com.salao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.salao.entities.Cliente;
import com.salao.repository.ClienteRepository;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@RequestMapping(value = "/cadastroCliente", method = RequestMethod.GET)
	public String cadastroCliente() {
		return "cadastro-cliente";
	}
	
	@RequestMapping(value = "/cadastroCliente", method = RequestMethod.POST)
	public String salvarCliente(Cliente cliente) {

		
		clienteRepository.save(cliente);
		
		
		return "redirect:/clientes.html";
	}
	
	@RequestMapping("/clientes")
	public String buscarCliente(Model model) {
		
		model.addAttribute("clientes", clienteRepository.findAll());
		
		return "clientes";
	}
}

