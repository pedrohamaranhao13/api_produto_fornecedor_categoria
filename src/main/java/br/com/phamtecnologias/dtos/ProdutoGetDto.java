package br.com.phamtecnologias.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class ProdutoGetDto {
	
	private UUID id;
	private String nome;
	private Double preco;
	private Integer quantidade;
	private String descricao;
	private CategoriaGetDto categoria;
	private FornecedorGetDto fornecedor;

}
