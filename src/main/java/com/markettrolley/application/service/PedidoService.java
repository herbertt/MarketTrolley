package com.markettrolley.application.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.markettrolley.application.domain.ItemPedido;
import com.markettrolley.application.domain.Pedido;

public interface PedidoService {
    // save operation
    Pedido savePedido(Pedido pedido);
  
    // read operation
    List<Pedido> fetchPedidoList();
  
    // update operation
    Pedido updatePedido(Pedido pedido, Long pedidoId);
  
    // delete operation
    void deletePedidoById(Long pedidoId);
    
    // read operation
	Pedido getById(Long pedidoId);
	
	Pedido inserirItemPedido(@RequestBody ItemPedido item, @PathVariable("id") Long pedidoId);

	void excluirItemPedido(ItemPedido item, Long pedidoId);
}
