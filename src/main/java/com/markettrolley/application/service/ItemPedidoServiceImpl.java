package com.markettrolley.application.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markettrolley.application.domain.ItemPedido;
import com.markettrolley.application.repository.ItemPedidoRepository;

@Service
public class ItemPedidoServiceImpl implements ItemPedidoService {

	@Autowired
	private ItemPedidoRepository itemPedidoRepository;


	@Override
	public ItemPedido saveItemPedido(ItemPedido itemPedido) {
		// TODO Auto-generated method stub
		return itemPedidoRepository.save(itemPedido);
	}

	@Override
	public List<ItemPedido> fetchItemPedidoList() {
		// TODO Auto-generated method stub
		return (List<ItemPedido>) itemPedidoRepository.findAll();
	}

	@Override
	public ItemPedido updateItemPedido(ItemPedido itemPedido, Long itemPedidoId) {
		// TODO Auto-generated method stub
		
		ItemPedido item = itemPedidoRepository.findById(itemPedidoId).get();


		if (Objects.nonNull(itemPedido.getPrecoUnitario())) {
			item.setPrecoUnitario(itemPedido.getPrecoUnitario());
		}
        if (Objects.nonNull(itemPedido.getPrecoTotal())) {
        	item.setPrecoTotal(itemPedido.getPrecoTotal());
        }
        if (Objects.nonNull(itemPedido.getQtd())) {
        	item.setQtd(itemPedido.getQtd());
	    }
        if (Objects.nonNull(itemPedido.getProduto())) {
        	item.setProduto(itemPedido.getProduto());
        }
        if (Objects.nonNull(itemPedido.getPedidos())) {
        	item.setPedidos(itemPedido.getPedidos()); 
        }

        return itemPedidoRepository.save(item);	
		
	}

	@Override
	public void deleteItemPedidoById(Long itemPedidoId) {
		// TODO Auto-generated method stub
		itemPedidoRepository.deleteById(itemPedidoId);
		
	}
 
}

