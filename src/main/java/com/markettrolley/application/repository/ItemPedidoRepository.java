package com.markettrolley.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.markettrolley.application.domain.ItemPedido;

@Repository
public interface ItemPedidoRepository extends CrudRepository<ItemPedido,Long> {

}
