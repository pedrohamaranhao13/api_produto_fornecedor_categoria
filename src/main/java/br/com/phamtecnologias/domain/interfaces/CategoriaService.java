package br.com.phamtecnologias.domain.interfaces;

import java.util.List;

import br.com.phamtecnologias.domain.entities.Categoria;

public interface CategoriaService {

	List<Categoria> findAll() throws Exception;
}
