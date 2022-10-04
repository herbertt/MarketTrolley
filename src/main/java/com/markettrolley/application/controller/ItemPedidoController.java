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

import com.markettrolley.application.domain.ItemPedido;
import com.markettrolley.application.service.ItemPedidoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("itemPedido")
public class ItemPedidoController {

	private static Logger logger = LoggerFactory.getLogger(PredidoController.class);

	@Autowired
	private ItemPedidoService itemPedidoService;

	// Save operation
	@PostMapping("/save")
	public ItemPedido saveItemPedido(@RequestBody ItemPedido itemPedido) {
		logger.info("Save operation");
		return itemPedidoService.saveItemPedido(itemPedido);
	}

	// Read operation
	@GetMapping("/itemPedidos")
	public List<ItemPedido> fetchItemPedidoList() {
		logger.info("Read operation");
		return itemPedidoService.fetchItemPedidoList();
	}

	// Update operation
	@PutMapping("/itemPedido/{id}")
	public ItemPedido updateItemPedido(@RequestBody ItemPedido itemPedido, @PathVariable("id") Long itemPedidoId) {
		logger.info("Update operation");
		return itemPedidoService.updateItemPedido(itemPedido, itemPedidoId);
	}

	// Delete operation
	@DeleteMapping("/itemPedido/{id}")
	public String deleteItemPedidoById(@PathVariable("id") Long itemPedidoId) {
		logger.info("Delete operation");
		itemPedidoService.deleteItemPedidoById(itemPedidoId);
		return "Deleted Successfully";
	}

}
