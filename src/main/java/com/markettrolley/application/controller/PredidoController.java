package com.markettrolley.application.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markettrolley.application.domain.Pedido;
import com.markettrolley.application.service.PedidoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("pedido")
public class PredidoController {

	private static Logger logger = LoggerFactory.getLogger(PredidoController.class);

	@Autowired
	private PedidoService pedidoService;

	// Save operation
	@PostMapping("/pedido")
	public Pedido savePedido(@RequestBody Pedido pedido) {
		logger.info("Save operation");
		return pedidoService.savePedido(pedido);
	}

	// Read operation
	@GetMapping("/pedido")
	public List<Pedido> fetchPedidoList() {
		logger.info("Read operation");
		return pedidoService.fetchPedidoList();
	}

	// Update operation
	@PutMapping("/pedido/{id}")
	public Pedido updatePedido(@RequestBody Pedido pedido, @PathVariable("id") Long pedidoId) {
		logger.info("Update operation");
		return pedidoService.updatePedido(pedido, pedidoId);
	}

	// Delete operation
	@DeleteMapping("/pedido/{id}")
	public String deletePedidoById(@PathVariable("id") Long pedidoId) {
		logger.info("Delete operation");
		pedidoService.deletePedidoById(pedidoId);
		return "Deleted Successfully";
	}

}