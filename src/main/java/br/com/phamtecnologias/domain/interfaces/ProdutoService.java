package br.com.phamtecnologias.domain.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.phamtecnologias.domain.entities.Produto;
import br.com.phamtecnologias.dtos.ProdutoPostDto;
import br.com.phamtecnologias.dtos.ProdutoPutDto;

public interface ProdutoService {
	
	void create(ProdutoPostDto dto) throws Exception;
	void update(ProdutoPutDto dto) throws Exception;
	void delete(UUID id) throws Exception;
	
	List<Produto> findAll() throws Exception;
	Produto findById(UUID id) throws Exception;
}
