package com.example.reservasBaldeDeLixo.adpter.input.dtos;

import com.example.reservasBaldeDeLixo.adpter.input.DtoResponse.ClienteCriadoResponseDto;
import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;
import org.springframework.stereotype.Component;

@Component
public class ClientesDtoMapper {

    public ClientesDto toDto(Clientes clientes) {
        return new ClientesDto(
                clientes.id(),
                clientes.nome(),
                clientes.cpf(),
                clientes.telefone(),
                clientes.email()
        );
    }

    public Clientes toDoamin(ClientesDto clientesdto) {
        return new Clientes(
                clientesdto.getId(),
                clientesdto.getNome(),
                clientesdto.getCpf(),
                clientesdto.getTelefone(),
                clientesdto.getEmail()
        );
    }

    public ClienteCriadoResponseDto clienteCriadoResponseDto(Clientes clientes) {
        return new ClienteCriadoResponseDto(
                clientes.nome(), "Cliente criado com sucesso!"
        );
    }



}
