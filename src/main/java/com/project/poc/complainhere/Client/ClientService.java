package com.project.poc.complainhere.Client;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository repository;

    private final ModelMapper modelMapper;


    public ClientService(ClientRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public Client create(ClientRequestDTO clientDTO) {

        Client client = modelMapper.map(clientDTO, Client.class);

        return this.repository.save(client);
    }

    public List<Client> getAll() {
        return this.repository.findAll();
    }

    public Optional<Client> getSingle(String name) {
        Optional<Client> client = this.repository.findClientByName(name);

        if (client.isEmpty()) {
            throw new RuntimeException("user not found");
        }

        return client;

    }

    @Transactional
    public Optional<Client> delete(String name) {
        Optional<Client> client = this.repository.deleteClientByName(name);

        if (client.isEmpty()) {
            throw new RuntimeException("user not found");
        }

        return client;


    }

    @Transactional
    public Optional<Client> put(String name, ClientRequestDTO clientDTO) {

        Client client = modelMapper.map(clientDTO, Client.class);


        Optional<Client> register = this.repository.findClientByName(name);


        if (register.isEmpty()) {
            throw new RuntimeException("user not found");
        }

        this.repository.deleteClientByName(name);


        return Optional.of(this.repository.save(client));

    }


}
