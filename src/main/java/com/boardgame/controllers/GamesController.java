package com.boardgame.controllers;

import com.boardgame.models.Game;
import com.boardgame.models.GameView;
import com.boardgame.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/games")
public class GamesController {
    @Autowired
    private GameService gameService;

    @GetMapping(value = "/all")
    public List<GameView> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping(value = "/owned")
    public List<GameView> getOwnedGames() {
        return gameService.getOwnedGames();
    }

    @GetMapping(value = "/wishlist")
    public List<GameView> getWishlistGames() {
        return gameService.getWishlistGames();
    }
}
