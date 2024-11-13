package br.com.phamtecnologias.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.phamtecnologias.domain.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria , UUID> {

}
