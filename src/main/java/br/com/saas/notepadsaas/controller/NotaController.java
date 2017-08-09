package br.com.saas.notepadsaas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.saas.notepadsaas.model.Nota;
import br.com.saas.notepadsaas.repository.NotaRepository;

@RestController
public class NotaController {
	
	@Autowired
	private NotaRepository notaRepository;

	@GetMapping(value = "/")
	public List<Nota> findAll() {
		return notaRepository.findAll();
	}
	
	@PostMapping(value = "/")
	public void save(@RequestBody Nota nota) {
		notaRepository.save(nota);
	}
	
	
}
