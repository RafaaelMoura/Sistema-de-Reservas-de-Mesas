package com.example.reservasBaldeDeLixo.config;

import com.example.reservasBaldeDeLixo.application.port.input.BuscarClienteId;
import com.example.reservasBaldeDeLixo.application.port.input.CriarClienteUsecase;
import com.example.reservasBaldeDeLixo.application.port.input.ListarClientesInput;
import com.example.reservasBaldeDeLixo.application.port.output.ClientesGateway;
import com.example.reservasBaldeDeLixo.application.usecase.BuscarIdUseCaseImpl;
import com.example.reservasBaldeDeLixo.application.usecase.CriaClienteUsecaseImpl;
import com.example.reservasBaldeDeLixo.application.usecase.ListarClienteImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CriarClienteUsecase criarCliente(ClientesGateway clientesGateway) {
        return new CriaClienteUsecaseImpl(clientesGateway);
    }

    @Bean
    public ListarClientesInput listarTodosClientes(ClientesGateway clientesGateway) {
        return new ListarClienteImpl(clientesGateway);
    }

    @Bean
    public BuscarClienteId buscarClienteId(ClientesGateway clientesGateway) {
        return new BuscarIdUseCaseImpl(clientesGateway);
    }

}
