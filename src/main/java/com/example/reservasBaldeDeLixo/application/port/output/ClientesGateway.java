package com.example.reservasBaldeDeLixo.application.port.output;

import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;

public interface ClientesGateway {
    Clientes cria(Clientes clientes);
}
