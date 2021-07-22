package com.api.loja.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping
    ResponseEntity menuInicial(){
        Map<String, String> menu = new LinkedHashMap();
        menu.put("Clientes: ", "/clientes");
        menu.put("Produtos: ", "/produtos");
        menu.put("Dica: ", "Para acessar um recurso use o hyperlink");
        return ResponseEntity.status(HttpStatus.OK).body(menu);
    }

}
