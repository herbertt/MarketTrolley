package com.markettrolley.application.service;

import java.util.List;

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
}
