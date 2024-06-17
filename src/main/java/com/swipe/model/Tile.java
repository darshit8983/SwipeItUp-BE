package com.swipe.model;

import lombok.Data;

@Data
public abstract class Tile {

    String tileId;
    String description;
    String title;
    String imageUrl;
}
