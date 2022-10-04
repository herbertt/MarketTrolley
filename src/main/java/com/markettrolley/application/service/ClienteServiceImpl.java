package com.markettrolley.application.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markettrolley.application.domain.Cliente;
import com.markettrolley.application.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;


	@Override
	public Cliente saveCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> fetchClienteList() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	public Cliente updateCliente(Cliente cliente, Long clienteId) {
		// TODO Auto-generated method stub
		
		Cliente cli = clienteRepository.findById(clienteId).get();

		
        if (Objects.nonNull(cliente.getNome()) && !"".equalsIgnoreCase(cliente.getNome())) {
        	cli.setNome(cliente.getNome());
        }
        if (Objects.nonNull(cliente.getEmail()) && !"".equalsIgnoreCase(cliente.getEmail())) {
        	cli.setEmail(cliente.getEmail());
        }
        if (Objects.nonNull(cliente.getSenha()) && !"".equalsIgnoreCase(cliente.getSenha())) {
        	cli.setSenha(cliente.getSenha());
        }
        
        return clienteRepository.save(cli);
			
	}

	@Override
	public void deleteClienteById(Long clienteId) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(clienteId);
		
	}
 
}
