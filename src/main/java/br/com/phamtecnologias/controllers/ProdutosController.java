package br.com.phamtecnologias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phamtecnologias.domain.entities.Produto;
import br.com.phamtecnologias.domain.interfaces.ProdutoService;
import br.com.phamtecnologias.dtos.ProdutoPostDto;
import br.com.phamtecnologias.dtos.SuccessResponseDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutosController {
	
	@Autowired
	ProdutoService produtoService;
	
	@PostMapping
	public ResponseEntity<SuccessResponseDto> post(@RequestBody @Valid ProdutoPostDto dto) throws Exception{
		produtoService.create(dto);
		
		SuccessResponseDto response = new SuccessResponseDto();
		response.setStatus(HttpStatus.CREATED);
		response.setMessage("Produto cadastrado com sucesso");
		
		return ResponseEntity.status(201).body(response);
	}
	
	@PutMapping
	public void put() {
		//TODO
	}
	
	@DeleteMapping
	public void delete() {
		//TODO
	}
	
	@GetMapping
	public List<Produto> getAll() {
		try {
			return produtoService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	

}
