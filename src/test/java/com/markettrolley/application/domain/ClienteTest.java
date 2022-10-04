package com.markettrolley.application.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;

import com.markettrolley.application.domain.Cliente;


public class ClienteTest {
	 
		Cliente cliente;
		
	    @Before
	    public void setUp() throws Exception {
	    	cliente = new Cliente();
	    }

	    @Test
	    public void objeto(){
	    	
	    	cliente.setId((long) 1);
	    	cliente.setNome("cliente");
	    	cliente.setEmail("cliente@cliente");
	    	cliente.setSenha("senha");	   
	        Assert.assertNotNull(cliente);
	        Assert.assertEquals(Long.valueOf(1), cliente.getId());
	        Assert.assertEquals("cliente", cliente.getNome());
	        Assert.assertEquals("cliente@cliente", cliente.getEmail());
	        Assert.assertEquals("senha", cliente.getSenha());
	    }
}
