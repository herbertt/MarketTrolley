package com.markettrolley.application.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.markettrolley.application.domain.Produto;


public class ProdutoTest {
	
	Produto produto;
	
    @Before
    public void setUp() throws Exception {
    	produto = new Produto();
    }

    @Test
    public void objeto(){
    	
    	produto.setId((long) 1);
    	produto.setTitulo("titulo");
    	produto.setDescricao("descricao");
    	produto.setPreco((double) 200);
    	produto.setNomeImagem("nomeImagem");

        Assert.assertNotNull(produto);  
        Assert.assertEquals(Long.valueOf(1), produto.getId());     
        Assert.assertEquals("titulo", produto.getTitulo());
        Assert.assertEquals("descricao", produto.getDescricao());
        Assert.assertEquals(Double.valueOf(200), produto.getPreco());
        Assert.assertEquals("nomeImagem", produto.getNomeImagem());
    }

}
