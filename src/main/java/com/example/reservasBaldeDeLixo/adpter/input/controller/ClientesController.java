package com.example.reservasBaldeDeLixo.adpter.input.controller;

import com.example.reservasBaldeDeLixo.adpter.input.dtos.ClientesDto;
import com.example.reservasBaldeDeLixo.adpter.input.dtos.ClientesDtoMapper;
import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;
import com.example.reservasBaldeDeLixo.application.port.input.CriarCliente;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("V1/baldedelixo")
@RequiredArgsConstructor
public class ClientesController {

    private final CriarCliente criarCliente;
    private final ClientesDtoMapper mapper;

    public ClientesDto criar(@RequestBody ClientesDto clientesDto) {
        Clientes criarClientes = criarCliente.execute(mapper.toDoamin(clientesDto));
        return mapper.toDto(criarClientes);
    }

}
