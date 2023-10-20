package Desafio.dio.ApiRestSpring.service;

import Desafio.dio.ApiRestSpring.model.Cliente;

public interface ClientService {
    Cliente findById(Long id);

    Cliente create(Cliente clienteToCreate);

}
