package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.model.Pedido;
import com.example.demo.persistence.PedidoRepository;

@DataJpaTest
public class PedidoRepositoryTest {

  //  @Autowired
   // private PedidoRepository pedidoRepository;

  //  @Test
  //  public void quandoSalvarPedido_entaoEncontrarPorId() {
  //      Pedido pedido = new Pedido();
  //      pedido.setIdCliente(1);
  //      pedido.setIdsProdutos(1);

   //     pedidoRepository.save(pedido);

   //     Optional<Pedido> encontradoPorId = pedidoRepository.findById(1);
   //     assertTrue(encontradoPorId.isPresent());
   //     assertEquals(1, encontradoPorId.get().getIdCliente());
   // }

    
}
