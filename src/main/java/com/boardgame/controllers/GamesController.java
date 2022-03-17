package com.boardgame.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GamesController {
    @RequestMapping
    public String getGames() {
        return "Getting games";
    }
}
