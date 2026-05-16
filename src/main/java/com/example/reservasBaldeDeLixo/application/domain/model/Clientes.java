package com.example.reservasBaldeDeLixo.application.domain.model;

public record Clientes(
        Long id,
        String nome,
        String cpf,
        String telefone,
        String email) {
}
