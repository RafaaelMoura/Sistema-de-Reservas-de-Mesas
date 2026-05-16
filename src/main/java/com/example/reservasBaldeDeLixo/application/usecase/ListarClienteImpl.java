package com.example.reservasBaldeDeLixo.application.usecase;

import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;
import com.example.reservasBaldeDeLixo.application.port.input.CriarClienteUsecase;
import com.example.reservasBaldeDeLixo.application.port.input.ListarClientesInput;
import com.example.reservasBaldeDeLixo.application.port.output.ClientesGateway;

import java.util.List;

public class ListarClienteImpl implements ListarClientesInput{


    private ClientesGateway clientesGateway;

    public ListarClienteImpl(ClientesGateway clientesGateway) {
        this.clientesGateway = clientesGateway;
    }

    @Override
    public List<Clientes> execute() {
        return clientesGateway.buscarClientes();
    }
}
