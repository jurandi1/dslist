package com.jurandi.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jurandi.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
