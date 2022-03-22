package com.boardgame.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.jdbc.core.RowMapper;

import java.util.UUID;

@Data
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table("games")
public class Game {
    @Id
    private UUID uuid;
    private String gameId;
    private boolean owned;
    private boolean wish;

    public static final RowMapper<Game> GAME_ROW_MAPPER = (rs, row) -> {
        Game game = Game.builder()
                .uuid(UUID.fromString(rs.getString("id")))
                .gameId(rs.getString("game_id"))
                .owned(rs.getBoolean("owned"))
                .wish(rs.getBoolean("wish"))
                .build();
                return game;
    };
}
