package com.example.reservasBaldeDeLixo.adpter.output.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<ClientesEntity, Long> {


    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
    boolean existsByTelefone(String telefone);}
