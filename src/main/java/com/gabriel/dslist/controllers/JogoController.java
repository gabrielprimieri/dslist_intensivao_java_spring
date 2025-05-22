package com.gabriel.dslist.controllers;

import com.gabriel.dslist.dto.JogoDTO;
import com.gabriel.dslist.dto.JogoMinDTO;
import com.gabriel.dslist.services.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping(value = "/{id}")
    public JogoDTO findById(@PathVariable Long id) {
        JogoDTO resultado = jogoService.findById(id);
        return resultado;
    }

    @GetMapping
    public List<JogoMinDTO> findAll () { // LINHA 28
        List<JogoMinDTO> resultado = jogoService.findAll();
        return resultado;
    }
}
