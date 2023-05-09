package com.jurandi.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jurandi.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
