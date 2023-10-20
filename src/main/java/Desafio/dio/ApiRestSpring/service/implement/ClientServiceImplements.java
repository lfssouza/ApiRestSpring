package Desafio.dio.ApiRestSpring.service.implement;

import Desafio.dio.ApiRestSpring.Repository.ClientRepository;
import Desafio.dio.ApiRestSpring.model.Cliente;
import Desafio.dio.ApiRestSpring.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClientServiceImplements implements ClientService {

    private final ClientRepository clienteRepository;

    public ClientServiceImplements(ClientRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }
    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Cliente create(Cliente clienteToCreate) {
        if (clienteToCreate.getId() != null && clienteRepository.existsById(clienteToCreate.getId())){
            throw new IllegalArgumentException("This reservation has already been made");
        }
        return clienteRepository.save(clienteToCreate);
    }
}
