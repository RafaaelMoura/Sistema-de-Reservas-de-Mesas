package com.example.reservasBaldeDeLixo.application.port.output;

import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;

import java.util.List;

public interface ClientesGateway {

    Clientes criar(Clientes clientes);
    List<Clientes> buscarClientes();

    boolean clienteExiste(String cpf);
    boolean emailExiste(String email);
    boolean telefoneExiste(String telefone);


}
