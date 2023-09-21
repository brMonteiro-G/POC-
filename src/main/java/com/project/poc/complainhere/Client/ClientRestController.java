package com.project.poc.complainhere.Client;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/complain-here")
public class ClientRestController {


private final  ClientService service;

    public ClientRestController(ClientService service) {
        this.service = service;
    }

    @GetMapping(path = "/clients")
    public List<Client> getAllClients() {
        return this.service.getAll();
}


}
