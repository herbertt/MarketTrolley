package com.markettrolley.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.markettrolley.application.domain.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido,Long> {

}
