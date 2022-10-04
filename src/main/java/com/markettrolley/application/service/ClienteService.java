package com.markettrolley.application.service;

import java.util.List;

import com.markettrolley.application.domain.Cliente;

public interface ClienteService {
    // save operation
	Cliente saveCliente(Cliente cliente);
  
    // read operation
    List<Cliente> fetchClienteList();
  
    // update operation
    Cliente updateCliente(Cliente cliente, Long clienteId);
  
    // delete operation
    void deleteClienteById(Long clienteId);
}
