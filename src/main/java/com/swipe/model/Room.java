package com.swipe.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Room {
    private String roomId;
    private int roomCode;
    private List<Member> members;
}
