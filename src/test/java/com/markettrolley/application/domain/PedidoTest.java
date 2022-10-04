package com.markettrolley.application.domain;

import java.text.ParseException;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PedidoTest {
	
	Pedido pedido;
	
    @Before
    public void setUp() throws Exception {
    	pedido = new Pedido();
    }

    @Test
    public void objeto() throws ParseException{

		    	
    	pedido.setId((long) 1);
    	Date d = new Date();
    	pedido.setData(d);
    	pedido.setValorTotal((double) 200);
   
        Assert.assertNotNull(pedido);
        Assert.assertEquals(Long.valueOf(1), pedido.getId());        
        Assert.assertEquals(d, pedido.getData());
        Assert.assertEquals(Double.valueOf(200), pedido.getValorTotal());
    }

}
