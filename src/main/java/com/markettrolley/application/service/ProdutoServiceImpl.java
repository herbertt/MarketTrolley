package com.markettrolley.application.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.markettrolley.application.domain.Produto;
import com.markettrolley.application.repository.ProdutoRepository;

public class ProdutoServiceImpl implements ProdutoService{
	
	@Autowired
	private ProdutoRepository produtoRepository;


	@Override
	public Produto saveProduto(Produto produto) {
		// TODO Auto-generated method stub
		return produtoRepository.save(produto);
	}

	@Override
	public List<Produto> fetchProdutoList() {
		// TODO Auto-generated method stub
		return (List<Produto>) produtoRepository.findAll();
	}

	@Override
	public Produto updateProduto(Produto produto, Long produtoId) {
		// TODO Auto-generated method stub
		
		Produto prod = produtoRepository.findById(produtoId).get();

		if (Objects.nonNull(produto.getDescricao()) && !"".equalsIgnoreCase(produto.getDescricao())) {
		    prod.setDescricao(produto.getDescricao());
		}
        if (Objects.nonNull(produto.getTitulo()) && !"".equalsIgnoreCase(produto.getTitulo())) {
        	prod.setTitulo(produto.getTitulo());
        }
        if (Objects.nonNull(produto.getNomeImagem()) && !"".equalsIgnoreCase(produto.getNomeImagem())) {
	    	prod.setNomeImagem(produto.getNomeImagem());
	    }
        if (Objects.nonNull(produto.getPreco())) {
        	prod.setPreco(produto.getPreco());  
        }

  
        return produtoRepository.save(prod);
		
		
	}

	@Override
	public void deleteProdutoById(Long produtoId) {
		// TODO Auto-generated method stub
		produtoRepository.deleteById(produtoId);
		
	}
 
}
