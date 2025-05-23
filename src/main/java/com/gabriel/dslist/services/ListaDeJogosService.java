package com.gabriel.dslist.services;

import com.gabriel.dslist.dto.ListaDeJogosDTO;
import com.gabriel.dslist.entities.ListaDeJogos;
import com.gabriel.dslist.repositories.ListaDeJogosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ListaDeJogosService{

    @Autowired
    private ListaDeJogosRepository listaDeJogosRepository;

    @Transactional(readOnly = true)
    public List<ListaDeJogosDTO> findAll() {
        List<ListaDeJogos> resultado = listaDeJogosRepository.findAll();
        return resultado.stream().map(ListaDeJogosDTO::new).toList();
    }
}
