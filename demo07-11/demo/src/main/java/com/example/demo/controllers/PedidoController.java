package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.PedidoService;
import com.example.demo.model.Pedido;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido salvar(@RequestBody Pedido pedido) {
        return pedidoService.criar(pedido);
    }

    @GetMapping
    public List<Pedido> listarTodos() {
        return pedidoService.listar();
    }

    @GetMapping("/cliente/{idCliente}")
    public List<Pedido> listarPorIdCliente(@PathVariable Long idCliente) {
        return pedidoService.listarPorIdCliente(idCliente);
    }

  //  @GetMapping("/produto/{idProduto}")
  //  public List<Pedido> listarPorIdProduto(@PathVariable Long idProduto) {
   //     return pedidoService.listarPorIdProduto(idProduto);
   // }
}