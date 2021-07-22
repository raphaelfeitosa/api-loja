package com.api.loja.controllers;


import com.api.loja.dto.FuncionarioDTO;
import com.api.loja.models.Funcionario;
import com.api.loja.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/funcionarios")
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<FuncionarioDTO> findById(@PathVariable Long id) {
    Funcionario funcionario = funcionarioService.findById(id);
    FuncionarioDTO funcionarioDTO = new FuncionarioDTO(funcionario);
    return ResponseEntity.status(HttpStatus.FOUND).body(funcionarioDTO);
    }
}

