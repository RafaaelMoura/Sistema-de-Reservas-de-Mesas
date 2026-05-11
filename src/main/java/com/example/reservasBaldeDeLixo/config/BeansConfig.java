package com.example.reservasBaldeDeLixo.config;

import com.example.reservasBaldeDeLixo.application.port.input.CriarCliente;
import com.example.reservasBaldeDeLixo.application.port.output.ClientesGateway;
import com.example.reservasBaldeDeLixo.application.usecase.CriaClienteUsecaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CriarCliente criarCliente(ClientesGateway clientesGateway) {
        return new CriaClienteUsecaseImpl(clientesGateway);
    }

}
