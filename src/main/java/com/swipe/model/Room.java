package com.swipe.model;

import lombok.Data;

import java.util.List;

@Data
public class Room {
    private String roomId;
    private List<Member> members;
    private Activity activity;
}
