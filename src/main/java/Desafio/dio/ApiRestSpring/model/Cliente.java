package Desafio.dio.ApiRestSpring.model;

import jakarta.persistence.*;

@Entity(name = "tb_client")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int quantoTempo;

    @OneToOne(cascade = CascadeType.ALL)
    private Destino destino;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantoTempo() {
        return quantoTempo;
    }

    public void setQuantoTempo(int quantoTempo) {
        this.quantoTempo = quantoTempo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }



}