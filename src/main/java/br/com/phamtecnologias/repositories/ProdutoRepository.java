package br.com.phamtecnologias.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.phamtecnologias.domain.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {

}
