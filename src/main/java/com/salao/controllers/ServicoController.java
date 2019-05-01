package com.salao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.salao.entities.Servico;
import com.salao.repository.ServicoRepository;

@Controller
public class ServicoController {
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	
	@RequestMapping(value="/servicoRegister", method=RequestMethod.GET)
	public String showServicoRegister(Model model) {
		
		model.addAttribute("servico", new Servico());
		
		
		return "servico-register";
	}
	
	
	@RequestMapping(value="/servicoRegister", method=RequestMethod.POST)
	public String saveServico(Servico servico) {
		
		servicoRepository.save(servico);
		
		
		return "redirect:/servicos.html";
	}
	
	@RequestMapping(value = "/servicos", method=RequestMethod.GET)
	public String showServicos(Model model) {
		
		model.addAttribute("servicos", servicoRepository.findAll());
		
		
		return "servicos";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView servicoDetail(@PathVariable Integer id) {
		Servico servico = servicoRepository.findOne(id);
		ModelAndView modelAndView = new ModelAndView("servico-detail");
		modelAndView.addObject("servico", servico);

		return modelAndView;
	}	
}

	