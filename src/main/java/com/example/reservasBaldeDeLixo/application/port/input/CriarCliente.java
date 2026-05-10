package com.example.reservasBaldeDeLixo.application.port.input;

import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;

public interface CriarCliente {

    public Clientes execute(Clientes clientes);
}
