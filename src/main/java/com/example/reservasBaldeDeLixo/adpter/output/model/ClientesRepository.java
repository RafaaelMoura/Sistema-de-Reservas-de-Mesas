package com.example.reservasBaldeDeLixo.adpter.output.model;

import com.example.reservasBaldeDeLixo.application.domain.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ClientesRepository extends JpaRepository<ClientesEntity, Long> {


    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
    boolean existsByTelefone(String telefone);
    Optional<ClientesEntity> findByClientesId(String cpf);

}

