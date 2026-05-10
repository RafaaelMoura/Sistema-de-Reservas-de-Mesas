package com.example.reservasBaldeDeLixo.adpter.input.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientesDto {

    private Long id;
    private String nome;
    private String telefone;
    private String email;
}
