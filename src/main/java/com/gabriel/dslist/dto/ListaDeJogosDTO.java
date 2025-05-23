package com.gabriel.dslist.dto;

import com.gabriel.dslist.entities.ListaDeJogos;

public class ListaDeJogosDTO {
    private Long id;
    private String nome;

    public ListaDeJogosDTO(){
    }

    public ListaDeJogosDTO(ListaDeJogos entity) {
       id = entity.getId();
       nome = entity.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}

