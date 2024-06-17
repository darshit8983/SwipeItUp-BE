package com.swipe.repository;

import com.swipe.model.Room;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class RoomRepositoryImpl implements RoomRepository {
    Map<UUID, Room> roomMap = new ConcurrentHashMap<>();

    public Room findRoomByRoomCode(int roomCode) {
        return roomMap.values().stream()
                .filter(room -> room.getRoomCode() == roomCode)
                .findFirst()
                .orElse(null);
    }

    public Room save(Room room) {
        if (room.getRoomId() == null) {
            room.setRoomId(UUID.randomUUID());
        }
        roomMap.put(room.getRoomId(), room);
        return room;
    }

    public Room findById(UUID roomId) {
        return roomMap.get(roomId);
    }

}
