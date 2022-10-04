package com.markettrolley.application.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markettrolley.application.domain.Pedido;
import com.markettrolley.application.repository.PedidoRepository;


@Service
public class PedidoServiceImpl implements PedidoService{
	
	@Autowired
	private PedidoRepository pedidoRepository;


	@Override
	public Pedido savePedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return pedidoRepository.save(pedido);
	}

	@Override
	public List<Pedido> fetchPedidoList() {
		// TODO Auto-generated method stub
		return (List<Pedido>) pedidoRepository.findAll();
	}

	@Override
	public Pedido updatePedido(Pedido pedido, Long pedidoId) {
		// TODO Auto-generated method stub
		
		Pedido ped = pedidoRepository.findById(pedidoId).get();
		  
        if (Objects.nonNull(pedido.getData()) && !"".equalsIgnoreCase(pedido.getData().toString())) {
        	ped.setData(pedido.getData());
        }
  
        if (Objects.nonNull(pedido.getValorTotal())) {
        	ped.setValorTotal(pedido.getValorTotal());
        }

  
        return pedidoRepository.save(ped);		
		
	}

	@Override
	public void deletePedidoById(Long pedidoId) {
		// TODO Auto-generated method stub
		pedidoRepository.deleteById(pedidoId);
		
	}
 
}
