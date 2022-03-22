package com.boardgame.respositories;

import com.boardgame.models.Game;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("games")
public interface GameRepository extends CrudRepository<Game, UUID> {
    @Query(
        "SELECT * FROM games WHERE owned = true"
    )
    List<Game> findOwnedGames();

    @Query(
        "SELECT * FROM games WHERE wish = true"
            )
    List<Game> findWishlistGames();
}
