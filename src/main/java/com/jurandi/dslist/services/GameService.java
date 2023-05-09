package com.jurandi.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jurandi.dslist.dto.GameMinDTO;
import com.jurandi.dslist.entities.Game;
import com.jurandi.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gamerepository;
	
	public List<GameMinDTO> findAll() { 
		List<Game> result = gamerepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
