package com.project.poc.complainhere.Enterprise;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseRestController {

    private final EnterpriseService service;

    public EnterpriseRestController(EnterpriseService service ){
        this.service = service;
    }


    @PostMapping(path = "/create")
    public Enterprise postEnterprise(@RequestBody EnterpriseRequestDTO enterpriseRequestDTO) throws JsonProcessingException {
        return this.service.create(enterpriseRequestDTO);
    }

    @GetMapping(path = "/fetch")
    public List<Enterprise> getAllEnterprises() {
        return this.service.getAll();
    }


}
