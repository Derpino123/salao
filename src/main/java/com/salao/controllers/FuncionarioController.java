package com.salao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.salao.entities.Funcionario;
import com.salao.repository.FuncionarioRepository;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@RequestMapping(value="/cadastroFuncionario",method=RequestMethod.GET)
	public String showFuncionarioRegister(Model model) {
		
		model.addAttribute("funcionario", new Funcionario());
		
		return "cadastro-funcionario";
	}
	
	@RequestMapping(value="/cadastroFuncionario", method=RequestMethod.POST)
	public String doFuncionarioRegister(Funcionario funcionario) {
		
		funcionarioRepository.save(funcionario);
		
		return "redirect:/funcionarios.html";
	}
	
	@RequestMapping(value="/funcionarios")
	public String showFuncionarios(Model model) {
		
		model.addAttribute("funcionarios", funcionarioRepository.findAll());
		
		return"funcionarios";
	}
	
	@RequestMapping(value = "/{matricula}", method=RequestMethod.GET)
	public ModelAndView funcionarioDetail(@PathVariable Integer matricula) {
		Funcionario funcionario = funcionarioRepository.findOne(matricula);
		ModelAndView modelAndView = new ModelAndView("funcionario-detail");
		modelAndView.addObject("funcionario", funcionario);

		return modelAndView;
	}	
}
