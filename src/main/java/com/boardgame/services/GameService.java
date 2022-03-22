package com.boardgame.services;

import com.boardgame.models.Game;
import com.boardgame.models.GameView;
import com.boardgame.respositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameView> getAllGames() {
        return StreamSupport.stream(gameRepository.findAll().spliterator(), false).map(g -> g.toView()).collect(Collectors.toList());
    }

    public List<GameView> getOwnedGames() {
        return gameRepository.findOwnedGames().stream().map(g -> g.toView()).collect(Collectors.toList());
    }

    public List<GameView> getWishlistGames() {
        return gameRepository.findWishlistGames().stream().map(g -> g.toView()).collect(Collectors.toList());
    }
}
