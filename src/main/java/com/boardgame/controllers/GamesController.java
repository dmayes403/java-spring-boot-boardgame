package com.boardgame.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/games")
public class GamesController {
    @GetMapping(value = "/owned")
    public String getGames() {
        return "Getting games";
    }
}
