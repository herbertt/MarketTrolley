package com.markettrolley.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.markettrolley.application.domain.Produto;


@Repository
public interface ProdutoRepository extends CrudRepository<Produto,Long> {


}
