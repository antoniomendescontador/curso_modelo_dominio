package com.mendes.cursomc.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mendes.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
