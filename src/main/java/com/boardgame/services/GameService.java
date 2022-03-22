package com.boardgame.services;

import com.boardgame.models.Game;
import com.boardgame.respositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<Game> getOwnedGames() {
        return gameRepository.findOwnedGames();
    }

    public List<Game> getWishlistGames() {
        return gameRepository.findWishlistGames();
    }
}
