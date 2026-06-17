package com.example.reservasBaldeDeLixo.application.port.input;

import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;

public interface BuscarClienteId {

    public Clientes execute(String cpfCliente);

}
