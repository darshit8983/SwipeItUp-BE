package com.swipe.model;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;
import java.util.UUID;

@Data
@Builder(toBuilder = true)
public class Room {
    private UUID roomId;
    private String roomCode;
    @Singular
    private List<Member> members;
    private UUID adminMember;
}
