package com.swipe.service;

import com.swipe.model.MovieTile;
import com.swipe.model.Tile;
import com.swipe.model.response.TileResponse;
import com.swipe.repository.MovieTileRepositoryImpl;
import com.swipe.repository.TileRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MovieTileServiceImpl implements TileService{

    MovieTileRepositoryImpl movieTileRepository;


    public MovieTileServiceImpl(MovieTileRepositoryImpl movieTileRepository) {
        this.movieTileRepository = movieTileRepository;
    }

    @Override
    public TileResponse getTiles() {
        Map<String, MovieTile> tileMap = movieTileRepository.getTileMap();
        return TileResponse.builder().tiles(tileMap.entrySet().stream()
                .map(c -> c.getValue()).collect(Collectors.toList())).build();
    }
}
