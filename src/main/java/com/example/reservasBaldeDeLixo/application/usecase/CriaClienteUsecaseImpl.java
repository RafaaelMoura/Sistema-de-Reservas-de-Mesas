package com.example.reservasBaldeDeLixo.application.usecase;

import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;
import com.example.reservasBaldeDeLixo.application.port.input.CriarCliente;
import com.example.reservasBaldeDeLixo.application.port.output.ClientesGateway;

public class CriaClienteUsecaseImpl implements CriarCliente {


    private final ClientesGateway clientesGateway;

    public CriaClienteUsecaseImpl(ClientesGateway clientesGateway) {
        this.clientesGateway = clientesGateway;
    }

    @Override
    public Clientes execute(Clientes clientes) {
        return clientesGateway.cria(clientes);
    }
}
