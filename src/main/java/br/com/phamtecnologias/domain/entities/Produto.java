package br.com.phamtecnologias.domain.entities;

import java.util.UUID;

import lombok.Data;

@Data
public class Produto {

	private UUID id;
	private String nome;
	private Integer quantidade;
	private Double preco;
	private String descricao;
	private Categoria categoria;
	private Fornecedor fornecedor;
}
