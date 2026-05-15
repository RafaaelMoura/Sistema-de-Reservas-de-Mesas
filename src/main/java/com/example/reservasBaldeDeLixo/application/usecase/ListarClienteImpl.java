package com.example.reservasBaldeDeLixo.application.usecase;

import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;
import com.example.reservasBaldeDeLixo.application.port.input.CriarClienteUsecase;
import com.example.reservasBaldeDeLixo.application.port.output.ClientesGateway;

public class CriaClienteUsecaseImpl implements CriarClienteUsecase {


    private final ClientesGateway clientesGateway;

    public CriaClienteUsecaseImpl(ClientesGateway clientesGateway) {
        this.clientesGateway = clientesGateway;
    }

    @Override
    public Clientes execute(Clientes clientes) {
        return clientesGateway.criar(clientes);
    }
}
