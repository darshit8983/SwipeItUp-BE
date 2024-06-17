package com.swipe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class Tile {

    String tileId;
    String description;
    String title;
    String imageUrl;
}
