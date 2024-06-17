package com.swipe.model.response;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.swipe.model.Tile;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TileResponse {

    @JsonUnwrapped
    private List<Tile> tiles;
}
