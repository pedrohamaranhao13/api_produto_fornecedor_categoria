package br.com.phamtecnologias.domain.interfaces;

import java.util.List;

import br.com.phamtecnologias.domain.entities.Fornecedor;

public interface FornecedorService {

	List<Fornecedor> findAll() throws Exception;
}
