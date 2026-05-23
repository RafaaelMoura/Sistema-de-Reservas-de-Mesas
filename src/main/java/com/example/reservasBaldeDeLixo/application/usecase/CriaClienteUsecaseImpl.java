package com.example.reservasBaldeDeLixo.application.usecase;

import com.example.reservasBaldeDeLixo.adpter.exception.DuplicateClientException;
import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;
import com.example.reservasBaldeDeLixo.application.port.input.CriarClienteUsecase;
import com.example.reservasBaldeDeLixo.application.port.output.ClientesGateway;
import org.springframework.dao.DuplicateKeyException;

public class CriaClienteUsecaseImpl implements CriarClienteUsecase {


    private final ClientesGateway clientesGateway;

    public CriaClienteUsecaseImpl(ClientesGateway clientesGateway) {
        this.clientesGateway = clientesGateway;
    }

    @Override
    public Clientes execute(Clientes clientes) {

        if (clientesGateway.clienteExiste(clientes.cpf())) {
            throw new DuplicateClientException(
                    "O CPF informado já está cadastrado.");
        }

        if (clientesGateway.emailExiste(clientes.email())) {
            throw new DuplicateClientException(
                    "O e-mail informado já está cadastrado.");
        }

        if (clientesGateway.telefoneExiste(clientes.telefone())) {
            throw new DuplicateClientException(
                    "O telefone informado já está cadastrado."
            );
        }

        return clientesGateway.criar(clientes);

    }
}
