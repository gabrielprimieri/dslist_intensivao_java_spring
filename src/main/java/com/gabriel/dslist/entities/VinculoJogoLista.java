package com.gabriel.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_vinculo_jogo_lista")
public class VinculoJogoLista {

    @EmbeddedId
    private VinculoJogoListaPK id = new VinculoJogoListaPK();

    private Integer posicao;

    public VinculoJogoLista() {
    }

    public VinculoJogoLista(Jogo jogo, ListaDeJogos listaDeJogos, Integer posicao) {
        id.setJogo(jogo);
        id.setListaDeJogos(listaDeJogos);
        this.posicao = posicao;
    }

    public VinculoJogoListaPK getId() {
        return id;
    }

    public void setId(VinculoJogoListaPK id) {
        this.id = id;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VinculoJogoLista other = (VinculoJogoLista) obj;
        return Objects.equals(id, other.id);
    }
}
