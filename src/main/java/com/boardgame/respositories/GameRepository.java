package com.boardgame.respositories;

import com.boardgame.models.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("games")
public interface GameRepository extends CrudRepository<Game, UUID> {
}
