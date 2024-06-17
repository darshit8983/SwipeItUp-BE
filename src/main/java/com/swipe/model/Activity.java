package com.swipe.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@Data
public class Activity {
    private String id;
    private HashMap<Tile, Integer> tileLikesCountMap;
    private int numPlayers;

    private Tile getWinnerTile() {
        for (Map.Entry<Tile, Integer> entry : tileLikesCountMap.entrySet()) {
            if (entry.getValue() == numPlayers) {
                return entry.getKey();
            }
        }
        return null;
    }
}
