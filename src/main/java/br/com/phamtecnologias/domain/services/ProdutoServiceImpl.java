package br.com.phamtecnologias.domain.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.phamtecnologias.domain.entities.Categoria;
import br.com.phamtecnologias.domain.entities.Fornecedor;
import br.com.phamtecnologias.domain.entities.Produto;
import br.com.phamtecnologias.domain.interfaces.ProdutoService;
import br.com.phamtecnologias.dtos.ProdutoPostDto;
import br.com.phamtecnologias.repositories.CategoriaRepository;
import br.com.phamtecnologias.repositories.FornecedorRepository;
import br.com.phamtecnologias.repositories.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService{
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@Autowired
	FornecedorRepository fornecedorRepository;
	
	@Autowired
	CategoriaRepository categoriaRepository;

	@Override
	public void create(ProdutoPostDto dto) throws Exception {
		
		Optional<Fornecedor> fornecedor = fornecedorRepository.findById(dto.getIdFornecedor());
		Optional<Categoria> categoria = categoriaRepository.findById(dto.getIdCategoria());
		
		if (fornecedor.isEmpty()) {
			throw new IllegalArgumentException("Erro. O fornecedor informado não existe.");
		}
		if (categoria.isEmpty()) {
			throw new IllegalArgumentException("Erro. A categoria informado não existe.");
		}
		
		Produto produto = new Produto();
		
		produto.setId(UUID.randomUUID());
		produto.setNome(dto.getNome());
		produto.setPreco(new BigDecimal(dto.getPreco()));
		produto.setQuantidade(dto.getQuantidade());
		produto.setDescricao(dto.getDescricao());
		produto.setFornecedor(fornecedor.get());
		produto.setCategoria(categoria.get());
		
		produtoRepository.save(produto);
	}

	@Override
	public void update(Produto produto) throws Exception {
		produtoRepository.save(produto);
	}

	@Override
	public void delete(UUID id) throws Exception {
		Produto produto = produtoRepository.findById(id).get();
		produtoRepository.delete(produto);
	}

	@Override
	public List<Produto> findAll() throws Exception {
		return (List<Produto>) produtoRepository.findAll();
	}

	@Override
	public Produto findById(UUID id) throws Exception {
		return produtoRepository.findById(id).get();
	}

}
