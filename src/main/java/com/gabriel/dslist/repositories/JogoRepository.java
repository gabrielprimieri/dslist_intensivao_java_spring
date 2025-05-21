package com.gabriel.dslist.repositories;

import com.gabriel.dslist.entities.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
    
}
