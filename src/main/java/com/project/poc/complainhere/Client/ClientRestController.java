package com.project.poc.complainhere.Client;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientRestController {

    private final ClientService service;

    public ClientRestController(ClientService service) {
        this.service = service;
    }

    @PostMapping(path = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Client postClient(@RequestBody @Valid ClientRequestDTO clientDTO){
        return this.service.create(clientDTO);
    }

    @GetMapping(path = "/fetch")
    @ResponseStatus(HttpStatus.OK)
    public List<Client> getAllClients() {
        return this.service.getAll();
    }

    @GetMapping(path = "/fetch/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Client> getClient(@PathVariable String name) {
        return this.service.getSingle(name);
    }

    @PutMapping(path = "/edit/{name}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Optional<Client> putClient(@PathVariable String name, @RequestBody ClientRequestDTO clientDTO) {
        return this.service.put(name, clientDTO);
    }

    @DeleteMapping(path = "/delete/{name}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Optional<Client> deleteClient(@PathVariable String name)  {
        return this.service.delete(name);
    }

}
