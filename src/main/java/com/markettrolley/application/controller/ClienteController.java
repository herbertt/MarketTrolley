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

import com.markettrolley.application.domain.Cliente;
import com.markettrolley.application.service.ClienteService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("cliente")
public class ClienteController {

	private static Logger logger = LoggerFactory.getLogger(PredidoController.class);

	@Autowired
	private ClienteService clienteService;

	// Save operation
	@PostMapping("/save")
	public Cliente saveCliente(@RequestBody Cliente cliente) {
		logger.info("Save operation");
		return clienteService.saveCliente(cliente);
	}

	// Read operation
	@GetMapping("/clientes")
	public List<Cliente> fetchClienteList() {
		logger.info("Read operation");
		return clienteService.fetchClienteList();
	}

	// Update operation
	@PutMapping("/cliente/{id}")
	public Cliente updateCliente(@RequestBody Cliente cliente, @PathVariable("id") Long clienteId) {
		logger.info("Update operation");
		return clienteService.updateCliente(cliente, clienteId);
	}

	// Delete operation
	@DeleteMapping("/cliente/{id}")
	public String deleteClienteById(@PathVariable("id") Long clienteId) {
		logger.info("Delete operation");
		clienteService.deleteClienteById(clienteId);
		return "Deleted Successfully";
	}

}