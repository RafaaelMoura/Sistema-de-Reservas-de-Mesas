package com.example.reservasBaldeDeLixo.adpter.output;

import com.example.reservasBaldeDeLixo.adpter.output.dtoEntity.ClientesEntityMapper;
import com.example.reservasBaldeDeLixo.adpter.output.model.ClientesEntity;
import com.example.reservasBaldeDeLixo.adpter.output.model.ClientesRepository;
import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;
import com.example.reservasBaldeDeLixo.application.port.output.ClientesGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ClientesRepositoryGateway implements ClientesGateway {

    /*
    Como esse metodo instacia diretamente o Jpa e ele quem faz a interação com o banco de dado, ele precisa de um
    mapper proprio do jpa
    */

    private final ClientesRepository clientesRepository;
    private final ClientesEntityMapper entityMapper;


    @Override
    public Clientes criar(Clientes clientes) {
        ClientesEntity entity = entityMapper.toEntity(clientes);
        ClientesEntity novoCliente = clientesRepository.save(entity);
        return entityMapper.toDomain(novoCliente);

    }

    @Override
    public List<Clientes> buscarClientes() {
        return clientesRepository.findAll()
                .stream()
                .map(entityMapper::toDomain).toList();
    }


}
