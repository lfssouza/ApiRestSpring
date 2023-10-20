package Desafio.dio.ApiRestSpring.Repository;

import Desafio.dio.ApiRestSpring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Cliente, Long> {
}
