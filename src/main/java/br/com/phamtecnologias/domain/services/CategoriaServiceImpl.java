package br.com.phamtecnologias.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.phamtecnologias.domain.entities.Categoria;
import br.com.phamtecnologias.domain.interfaces.CategoriaService;
import br.com.phamtecnologias.repositories.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Override
	public List<Categoria> findAll() throws Exception {
		return (List<Categoria>) categoriaRepository.findAll();
	}

}
