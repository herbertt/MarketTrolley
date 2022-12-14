package com.markettrolley.application.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.markettrolley.application.domain.ItemPedido;
import com.markettrolley.application.domain.Pedido;
import com.markettrolley.application.domain.Produto;



public class ItemPedidoTest {
	
	ItemPedido itemPedido;
	
    @Before
    public void setUp() throws Exception {
    	itemPedido = new ItemPedido();
    }

    @Test
    public void objeto(){
    	
    	
        itemPedido.setQtd(1);
        itemPedido.setPrecoUnitario((double) 20);
        itemPedido.setPrecoTotal((double) 20);
        

        Produto produto = new Produto();
        produto.setId((long) 1);
    	produto.setTitulo("titulo");
    	produto.setDescricao("descricao");
    	produto.setPreco((double) 200);
    	produto.setNomeImagem("nomeImagem");
        itemPedido.setProduto(produto);
        
     
        Pedido pedido = new Pedido();
        pedido.setId((long) 1);
    	pedido.setData(new Date());
    	pedido.setValorTotal((double) 200);
    	itemPedido.setPedidos(pedido);
        
        Assert.assertNotNull(itemPedido);
        Assert.assertEquals(Integer.valueOf(1), itemPedido.getQtd());
        Assert.assertEquals(Integer.valueOf(1), itemPedido.getQtd());
        Assert.assertEquals(Integer.valueOf(1), itemPedido.getQtd());
        Assert.assertNotNull(itemPedido.getProduto());
        Assert.assertNotNull(itemPedido.getPedidos());
      
    }

}
