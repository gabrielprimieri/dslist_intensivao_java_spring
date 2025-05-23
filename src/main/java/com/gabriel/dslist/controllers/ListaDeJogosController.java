package com.gabriel.dslist.controllers;

import com.gabriel.dslist.dto.JogoMinDTO;
import com.gabriel.dslist.dto.ListaDeJogosDTO;
import com.gabriel.dslist.services.JogoService;
import com.gabriel.dslist.services.ListaDeJogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/listas")
public class ListaDeJogosController {

    @Autowired
    private ListaDeJogosService listaDeJogosService;

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public List<ListaDeJogosDTO> findAll () {
        List<ListaDeJogosDTO> resultado = listaDeJogosService.findAll();
        return resultado;
    }

    @GetMapping(value = "/{ListaId}/jogos")
    public List<JogoMinDTO> findByList (@PathVariable Long ListaId) {
        List<JogoMinDTO> resultado = jogoService.findByList(ListaId);
        return resultado;
    }
}
