package com.project.poc.complainhere.Client;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientRestController {


private final  ClientService service;

    public ClientRestController(ClientService service) {
        this.service = service;
    }


    @PostMapping(path = "/create")
    public Client postClient(@RequestBody ClientRequestDTO clientDTO) throws JsonProcessingException {
        return this.service.create(clientDTO);
    }

    @GetMapping(path = "/fetch")
    public List<Client> getAllClients() {
        return this.service.getAll();
}





}
