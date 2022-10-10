package com.algaworks.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/v1/api/clientes")
    public String hello() {
        return "Hello";
    }
}
