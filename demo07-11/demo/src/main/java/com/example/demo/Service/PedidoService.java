package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pedido;
import com.example.demo.persistence.ClienteRepository;
import com.example.demo.persistence.PedidoRepository;
import com.example.demo.persistence.ProdutoRepository;

import java.util.List;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public Pedido criar(Pedido pedido) {
        if (pedido.getIdCliente() == null || !clienteRepository.existsById(pedido.getIdCliente())) {
            throw new IllegalArgumentException("O cliente é inválido");
        }
        if (pedido.getIdsProdutos().isEmpty()) {
            throw new IllegalArgumentException("Não há produtos no pedido");
        }
        for (Long idProduto : pedido.getIdsProdutos()) {
            if (!produtoRepository.existsById(idProduto)) {
                throw new IllegalArgumentException("Produto com ID " + idProduto + "não encontrado");
            }
        }
        return pedidoRepository.save(pedido);
    }

    public List <Pedido> listar() {
        return pedidoRepository.findAll();
    }

    public List <Pedido> listarPorIdCliente(Long idCliente) {
        return pedidoRepository.findByIdCliente(idCliente);
    }

  //  public List <Pedido> listarPorIdProduto(Long idProduto) {
  //      return pedidoRepository.findByProdutoIdPedido(idProduto);
  //  }
}
