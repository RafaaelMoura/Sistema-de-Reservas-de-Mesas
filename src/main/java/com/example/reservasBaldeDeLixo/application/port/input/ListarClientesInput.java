package com.example.reservasBaldeDeLixo.application.port.input;

import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;

import java.util.List;

public interface ListarClientesInput {

     public List<Clientes> execute();

}
