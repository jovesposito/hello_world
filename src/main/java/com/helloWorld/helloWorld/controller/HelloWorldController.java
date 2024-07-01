package com.helloWorld.helloWorld.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World!";
	} 
	
	@GetMapping("/bsm")
	public Set<String> bsm() {
		Set<String> bsm = new HashSet<>();
		bsm.addAll(Arrays.asList("Orientação ao futuro", "Responsabilidade pessoal", "Mentalidade de crescimento", "Persistência"
				+ "Trabalho em equipe", "Atenção aos detalhes", "Proatividade", "Comunicação"));
		
		return bsm;
	}
	
	@GetMapping("/objetivos")
	public Set<String> objetivos() {
		Set<String> objetivos = new HashSet<>();
		objetivos.addAll(Arrays.asList("Organizar meu GitHub", "Fazer exercícios adicionais de SQL", "Verificar nota das provas da faculdade", "Estudar Spring"));
		
		return objetivos;	
	}
}