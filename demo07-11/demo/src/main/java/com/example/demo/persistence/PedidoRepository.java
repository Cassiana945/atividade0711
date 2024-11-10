package com.example.demo.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Pedido;

public interface PedidoRepository extends JpaRepository <Pedido, Long> {
     List <Pedido> findByIdCliente(Long idCliente);
 //    @Query("SELECT p FROM Pedido p WHERE :idProduto IN p.idsProdutos")
 //     List<Pedido> findByProdutoIdPedido(Long idProduto);
}
