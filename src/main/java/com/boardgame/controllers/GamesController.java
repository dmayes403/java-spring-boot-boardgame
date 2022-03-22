package com.boardgame.controllers;

import com.boardgame.models.Game;
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

    @GetMapping(value = "/owned")
    public List<Game> getOwnedGames() {
        return gameService.getOwnedGames();
    }

    @GetMapping(value = "/wishlist")
    public List<Game> getWishlistGames() {
        return gameService.getWishlistGames();
    }
}
