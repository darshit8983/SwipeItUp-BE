package com.swipe.controller;

import com.swipe.model.response.TileResponse;
import com.swipe.service.TileServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.swipe.util.GlobalConstant.*;

@RestController
@RequestMapping(path = BASE_API_PATH_V1)
public class TileController {

    TileServiceFactory tileServiceFactory;

    @Autowired
    public TileController(TileServiceFactory tileServiceFactory) {
        this.tileServiceFactory = tileServiceFactory;
    }

    @GetMapping(value = TILE_TYPE_PATH)
    public TileResponse getTiles(@PathVariable String type) {
        return tileServiceFactory.getInstance(type).getTiles();

    }
}
