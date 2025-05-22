package com.gabriel.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class VinculoJogoListaPK {

    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private Jogo jogo;

    @ManyToOne
    @JoinColumn(name = "lista_de_jogos_id")
    private ListaDeJogos listaDeJogos;

    public VinculoJogoListaPK() {
    }

    public VinculoJogoListaPK(Jogo jogo, ListaDeJogos listaDeJogos) {
        this.jogo = jogo;
        this.listaDeJogos = listaDeJogos;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public ListaDeJogos getListaDeJogos() {
        return listaDeJogos;
    }

    public void setListaDeJogos(ListaDeJogos listaDeJogos) {
        this.listaDeJogos = listaDeJogos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VinculoJogoListaPK other = (VinculoJogoListaPK) obj;
        return Objects.equals(jogo, other.jogo) && Objects.equals(listaDeJogos, other.listaDeJogos);
}
}