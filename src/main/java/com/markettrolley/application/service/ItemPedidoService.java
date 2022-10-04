package com.markettrolley.application.service;

import java.util.List;

import com.markettrolley.application.domain.ItemPedido;

public interface ItemPedidoService {
    // save operation
	ItemPedido saveItemPedido(ItemPedido itemPedido);
  
    // read operation
    List<ItemPedido> fetchItemPedidoList();
  
    // update operation
    ItemPedido updateItemPedido(ItemPedido itemPedido, Long itemPedidoId);
  
    // delete operation
    void deleteItemPedidoById(Long itemPedidoId);
}
