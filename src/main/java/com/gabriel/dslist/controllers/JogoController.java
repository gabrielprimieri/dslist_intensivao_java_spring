package com.gabriel.dslist.controllers;

import com.gabriel.dslist.dto.JogoMinDTO;
import com.gabriel.dslist.entities.Jogo;
import com.gabriel.dslist.services.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public List<JogoMinDTO> findAll() {
        List<JogoMinDTO> resultado = jogoService.findAll();
        return resultado;
    }
}
