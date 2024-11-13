package br.com.phamtecnologias.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.phamtecnologias.domain.entities.Fornecedor;
import br.com.phamtecnologias.domain.interfaces.FornecedorService;
import br.com.phamtecnologias.repositories.FornecedorRepository;

@Service
public class FornecedorServiceImpl implements FornecedorService{

	@Autowired
	FornecedorRepository fornecedorRepository;
	
	@Override
	public List<Fornecedor> findAll() throws Exception {
		return (List<Fornecedor>) fornecedorRepository.findAll();
	}

}
