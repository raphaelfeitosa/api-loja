package com.api.loja.dto;

import com.api.loja.models.Funcionario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FuncionarioDTO {

    private String nome;
    private String data_nascimento;
    private String email;
    private String cpf;

    public FuncionarioDTO(){
    }

    public FuncionarioDTO(String nome, String data_nascimento, String email, String cpf) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.email = email;
        this.cpf = cpf;
    }

    public FuncionarioDTO(Funcionario funcionario) {
        this.nome = funcionario.getNome();
        this.data_nascimento = funcionario.getdata_nascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyy"));
        this.email = funcionario.getEmail();
        this.cpf = funcionario.getCpf();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
