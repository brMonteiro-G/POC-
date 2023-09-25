package com.project.poc.complainhere.Client;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> getAll(){
        return this.repository.findAll();
    }

    public Client create(ClientRequestDTO clientDTO) throws JsonProcessingException {

        //usar object mapper

        //ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(clientDTO.toString());

       // Client teste = objectMapper.readValue(clientDTO.toString(), Client.class);

        Client teste =  modelMapper.map(clientDTO, Client.class);


        return this.repository.save(teste);
    }

}
