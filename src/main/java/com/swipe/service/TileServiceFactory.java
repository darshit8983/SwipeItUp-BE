package com.swipe.service;

import com.swipe.model.ActivityType;
import com.swipe.util.exception.BaseApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static com.swipe.model.ActivityType.*;

@Component
public class TileServiceFactory {

    MovieTileServiceImpl movieTileService;

    @Autowired
    public TileServiceFactory(MovieTileServiceImpl movieTileService) {
        this.movieTileService = movieTileService;
    }

    public TileService getInstance(String tileType) {
        switch (ActivityType.valueOf(tileType.toUpperCase().trim())) {
            case MOVIE:
                return movieTileService;
            default:
                throw new BaseApiException(HttpStatus.BAD_REQUEST,"Error occurred while calling API");
        }
    }
}
