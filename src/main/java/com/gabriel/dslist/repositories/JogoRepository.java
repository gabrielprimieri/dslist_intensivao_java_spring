package com.gabriel.dslist.repositories;

import com.gabriel.dslist.entities.Jogo;
import com.gabriel.dslist.projections.JogoMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JogoRepository extends JpaRepository<Jogo, Long> {

    @Query(nativeQuery = true, value = """
    SELECT tb_jogo.id, 
           tb_jogo.titulo, 
           tb_jogo.ano AS `ano`, 
           tb_jogo.img_url AS imgUrl,
           tb_jogo.descricao_curta AS descricaoCurta, 
           tb_vinculo_jogo_lista.posicao
    FROM tb_jogo
    INNER JOIN tb_vinculo_jogo_lista 
            ON tb_jogo.id = tb_vinculo_jogo_lista.jogo_id
    WHERE tb_vinculo_jogo_lista.lista_de_jogos_id = :listaId
    ORDER BY tb_vinculo_jogo_lista.posicao
        """)
    List<JogoMinProjection> searchByList(@Param("listaId") Long listaId);
}
