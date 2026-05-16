package com.example.reservasBaldeDeLixo.adpter.output.dtoEntity;

import com.example.reservasBaldeDeLixo.adpter.output.model.ClientesEntity;
import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;
import org.springframework.stereotype.Component;

@Component
public class ClientesEntityMapper {

    public ClientesEntity toEntity(Clientes clientes) {
        return new ClientesEntity(
                clientes.id(),
                clientes.nome(),
                clientes.telefone(),
                clientes.email()
        );
    }

    public Clientes toDomain(ClientesEntity clientesEntity) {
        return new Clientes(
                clientesEntity.getId(),
                clientesEntity.getNome(),
                clientesEntity.getTelefone(),
                clientesEntity.getEmail()
        );
    }
}
