package com.markettrolley.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.markettrolley.application.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long> {

}
