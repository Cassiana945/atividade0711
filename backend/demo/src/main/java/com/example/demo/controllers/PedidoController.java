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
    public Pedido criar(@RequestBody Long idCliente, List<Long> idsProdutos) {
        return pedidoService.criar(idCliente, idsProdutos);
    }

    @GetMapping
    public List<Pedido> listar() {
        return pedidoService.listar();
    }

    @GetMapping("/cliente/{idCliente}")
    public List<Pedido> listarPorIdCliente(@PathVariable Long idCliente) {
        return pedidoService.listarPorIdCliente(idCliente);
    }

    @GetMapping("/produto/{idProduto}")
    public List <Pedido> listarPorIdProdutos(@PathVariable Long idProduto){
        return pedidoService.listarPorIdProduto(idProduto);
    }

    @GetMapping("/{id}")
    public Pedido listarPorId(@PathVariable Long id) {
        return pedidoService.listarPorId(id);
    }

   
}