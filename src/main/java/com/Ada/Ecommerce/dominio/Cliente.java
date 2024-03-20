package com.Ada.Ecommerce.dominio;

public class Cliente {

    private String id;
    private String tipo;
    private String nome;
    private String email;
    private String endereco;

    public Cliente(String id, String nome, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        validar();
    }

    private void validar(){
        if (id == null || id.isEmpty()){
            throw new IllegalArgumentException("Id não pode ser nulo ou vazio");
        }
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        if (email == null || email.isEmpty()){
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio");
        }
        if (endereco == null || endereco.isEmpty()){
            throw new IllegalArgumentException("Endereço não pode ser nulo ou vazio");
        }
    }
}
