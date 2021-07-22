package com.api.loja.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String login;
    private String senha;
    private LocalDate data_nascimento;
    private String email;
    private String cpf;

    public Funcionario(){
    }

    public Funcionario(Long id, String nome, String login, String senha, LocalDate data_nascimento, String email, String cpf) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.data_nascimento = data_nascimento;
        this.email = email;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getdata_nascimento() {
        return data_nascimento;
    }

    public void setdata_nascimento(LocalDate data_nascimento) {
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
