package com.swipe.repository;

import com.swipe.model.MovieTile;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Data
@Repository
public class MovieTileRepositoryImpl implements TileRepository{

    Map<String, MovieTile> tileMap;

    public MovieTileRepositoryImpl() {
        MovieTile tile1 = MovieTile.builder().tileId("1").title("tile1").description("desc tile 1").build();
        MovieTile tile2 = MovieTile.builder().tileId("2").title("tile2").description("desc tile 2").build();
        MovieTile tile3 = MovieTile.builder().tileId("3").title("tile3").description("desc tile 3").build();
        MovieTile tile4 = MovieTile.builder().tileId("4").title("tile4").description("desc tile 4").build();
        tileMap = new ConcurrentHashMap<>();
        tileMap.put("1", tile1);
        tileMap.put("2", tile2);
        tileMap.put("3", tile3);
        tileMap.put("4", tile4);

        this.tileMap = tileMap;

    }

    public void addTile(MovieTile tile) {
        if(!tileMap.containsKey(tile.getTileId())) {
            tileMap.put(tile.getTileId(), tile);
        }
    }
}
