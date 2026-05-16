package com.example.reservasBaldeDeLixo.adpter.input.controller;

import com.example.reservasBaldeDeLixo.adpter.input.dtos.ClientesDto;
import com.example.reservasBaldeDeLixo.adpter.input.dtos.ClientesDtoMapper;
import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;
import com.example.reservasBaldeDeLixo.application.port.input.CriarClienteUsecase;
import com.example.reservasBaldeDeLixo.application.port.input.ListarClientesInput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("v1/baldedelixo")
public class ClientesController {

    private final CriarClienteUsecase criarClienteUsecase;
    private final ClientesDtoMapper mapper;
    private final ListarClientesInput listarClientesInput;

    public ClientesController(CriarClienteUsecase criarClienteUsecase, ClientesDtoMapper mapper, ListarClientesInput listarClientesInput) {
        this.criarClienteUsecase = criarClienteUsecase;
        this.mapper = mapper;
        this.listarClientesInput = listarClientesInput;
    }

    @PostMapping("/criarcliente")
    public ResponseEntity<Map<String, Object>> criar(@RequestBody ClientesDto clientesDto) { 
        Clientes criarClientes = criarClienteUsecase.execute(mapper.toDoamin(clientesDto));
        Map<String, Object> response = new HashMap<>();
        response.put("Menssagem:","Cliente Criado com Sucesso");
        response.put("Dados do Cliete",mapper.toDto(criarClientes));
        return ResponseEntity.ok(response);
    }

    @GetMapping("/listadeclientes")
    public List<ClientesDto> listar() {
        return listarClientesInput.execute()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }


}
