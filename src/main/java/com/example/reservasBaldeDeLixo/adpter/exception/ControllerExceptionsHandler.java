package com.example.reservasBaldeDeLixo.adpter.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice //Anotação controla a operação do controller de excessao
public class ControllerExceptionsHandler {

    //ESPECIFICO PARA O CAMPO CPF - CONFORME ESTUDADO
 /*   @ExceptionHandler(DuplicateClientException.class) //Anotação apresentada para metodos de excessão - (DuplicateClientException.class) isso diz que o metodo é so para essa classe
    public ResponseEntity<Map<String, String>> handleDuplicationClientException(DuplicateClientException exception) { //Esperam duas mensagens
        Map<String, String> response = new HashMap<>();
        response.put("Error: " , exception.getMessage());
        response.put("Mensagem", "Porfavor Avalie o numero do CPF");
    return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }*/

    @ExceptionHandler(DuplicateClientException.class)
    public ResponseEntity<Map<String, String>> handleDuplicateClientException(DuplicateClientException exception){
        Map<String, String> response = new HashMap<>();
        response.put("erro", exception.getMessage());

        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }
}
