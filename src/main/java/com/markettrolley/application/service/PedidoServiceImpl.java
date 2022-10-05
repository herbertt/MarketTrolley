package com.markettrolley.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markettrolley.application.domain.ItemPedido;
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
	public Pedido getById(Long pedidoId) {
		// TODO Auto-generated method stub
		return pedidoRepository.findById(pedidoId).get();
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

	@Override
	public Pedido inserirItemPedido(ItemPedido item, Long pedidoId) {
		// TODO Auto-generated method stub

		Pedido ped = pedidoRepository.findById(pedidoId).get();
		
		if(ped.getItensPedido().size()==0) {
			//if empty item
			List itens = new ArrayList<ItemPedido>();
			itens.add(item);
			ped.setItensPedido(itens);
		}else {
			for(ItemPedido iPed : ped.getItensPedido()) {
		       if(iPed.getProduto().getTitulo().equals(item.getProduto().getTitulo())) {
		    	   //update item
		    	   int newQtd = iPed.getQtd()+1;
		    	   double newPrice = iPed.getPrecoUnitario() * newQtd;
		    	   iPed.setQtd(newQtd);
		    	   iPed.setPrecoTotal(newPrice);
		    	   
		       }else {
		    	  //new item 
		    	   ped.getItensPedido().add(item);
		       }
			}
		}
			
		return ped;
	}
	
	
	@Override
	public void excluirItemPedido(ItemPedido item, Long pedidoId) {
		// TODO Auto-generated method stub

		Pedido ped = pedidoRepository.findById(pedidoId).get();

		for(ItemPedido iPed : ped.getItensPedido()) {
	       if(iPed.getProduto().getTitulo().equals(item.getProduto().getTitulo())) {
	    	   //update item
	    	   int newQtd = iPed.getQtd()-1;
	    	   double newPrice = iPed.getPrecoUnitario() * newQtd;
	    	   if(newQtd!=0) {
		    	   iPed.setQtd(newQtd);
		    	   iPed.setPrecoTotal(newPrice);
	    	   }else {
	    		   ped.getItensPedido().remove(iPed);
	    	   }
	    	   
	       }
		}

	}
 
}
