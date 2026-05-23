package com.example.reservasBaldeDeLixo.adpter.input.controller;

import com.example.reservasBaldeDeLixo.adpter.input.DtoResponse.ClienteCriadoResponseDto;
import com.example.reservasBaldeDeLixo.adpter.input.dtos.ClientesDto;
import com.example.reservasBaldeDeLixo.adpter.input.dtos.ClientesDtoMapper;
import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;
import com.example.reservasBaldeDeLixo.application.port.input.CriarClienteUsecase;
import com.example.reservasBaldeDeLixo.application.port.input.ListarClientesInput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/baldedelixo")
public class ClientesController {

    private final CriarClienteUsecase criarClienteUsecase;
    private final ClientesDtoMapper mapper;
    private final ListarClientesInput listarClientesInput;



    @PostMapping("/criarcliente")
    public ResponseEntity<ClienteCriadoResponseDto> criar(@RequestBody ClientesDto clientesDto) {
        Clientes criarClientes = criarClienteUsecase.execute(mapper.toDoamin(clientesDto));
        ClienteCriadoResponseDto response = mapper.clienteCriadoResponseDto(criarClientes);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/listadeclientes")
    public List<ClientesDto> listar() {
        return listarClientesInput.execute()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }


}
