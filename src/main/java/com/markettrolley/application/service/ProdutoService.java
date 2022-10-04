package com.markettrolley.application.service;

import java.util.List;

import com.markettrolley.application.domain.Produto;


public interface ProdutoService {
    // save operation
    Produto saveProduto(Produto produto);
  
    // read operation
    List<Produto> fetchProdutoList();
  
    // update operation
    Produto updateProduto(Produto produto, Long produtoId);
  
    // delete operation
    void deleteProdutoById(Long produtoId);
}
