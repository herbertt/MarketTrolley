package com.markettrolley.application.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markettrolley.application.domain.Produto;
import com.markettrolley.application.service.ProdutoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("produto")
public class ProdutoController {

	private static Logger logger = LoggerFactory.getLogger(PredidoController.class);

	@Autowired
	private ProdutoService produtoService;

	// Save operation
	@PostMapping("/save")
	public Produto saveProduto(@RequestBody Produto produto) {
		logger.info("Save operation");
		return produtoService.saveProduto(produto);
	}

	// Read operation
	@GetMapping("/produtos")
	public List<Produto> fetchProdutoList() {
		logger.info("Read operation");
		return produtoService.fetchProdutoList();
	}

	// Update operation
	@PutMapping("/produto/{id}")
	public Produto updateProduto(@RequestBody Produto produto, @PathVariable("id") Long produtoId) {
		logger.info("Update operation");
		return produtoService.updateProduto(produto, produtoId);
	}

	// Delete operation
	@DeleteMapping("/produto/{id}")
	public String deleteProdutoById(@PathVariable("id") Long produtoId) {
		logger.info("Delete operation");
		produtoService.deleteProdutoById(produtoId);
		return "Deleted Successfully";
	}
	
}
