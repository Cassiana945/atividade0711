package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.List;


@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    private Long idCliente;
    private List <Long> idsProdutos;

    public Pedido(){

    }
   
    public Pedido(Long idCliente, List <Long> idsProdutos) {
        this.idCliente = idCliente;
        this.idsProdutos = idsProdutos;
    }
    
    public Long getIdPedido() {
        return idPedido;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public List<Long> getIdsProdutos() {
        return idsProdutos;
    }

    public void setIdsProdutos(List <Long> idsProdutos) {
        this.idsProdutos = idsProdutos;
    }

    
}
