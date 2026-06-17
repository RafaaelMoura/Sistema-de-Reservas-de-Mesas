package com.example.reservasBaldeDeLixo.application.usecase;

import com.example.reservasBaldeDeLixo.adpter.exception.NotFoundClienteException;
import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;
import com.example.reservasBaldeDeLixo.application.port.input.BuscarClienteId;
import com.example.reservasBaldeDeLixo.application.port.output.ClientesGateway;

public class BuscarIdUseCaseImpl implements BuscarClienteId {

        private final ClientesGateway clientesGateway;

    public BuscarIdUseCaseImpl(ClientesGateway clientesGateway) {
        this.clientesGateway = clientesGateway;
    }


    @Override
    public Clientes execute(String cpfCliente) {
        return clientesGateway.buscarClientePorId(cpfCliente)
                .orElseThrow(() -> new NotFoundClienteException("Cliente não encontrado com o CPF: " + cpfCliente));

    }
}
