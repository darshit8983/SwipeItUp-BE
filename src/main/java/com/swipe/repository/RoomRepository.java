package com.swipe.repository;

import com.swipe.model.Room;

import java.util.UUID;


public interface RoomRepository {

    Room findRoomByRoomCode(String roomCode);

    Room save(Room room);

    Room findById(UUID roomId);
}
