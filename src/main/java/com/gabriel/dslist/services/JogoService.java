package com.gabriel.dslist.services;

import com.gabriel.dslist.dto.JogoMinDTO;
import com.gabriel.dslist.entities.Jogo;
import com.gabriel.dslist.repositories.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public List<JogoMinDTO> findAll() {
        List<Jogo> resultado = jogoRepository.findAll();
        List<JogoMinDTO> dto = resultado.stream().map(x -> new JogoMinDTO(x)).toList();
        return dto;
    }
}
