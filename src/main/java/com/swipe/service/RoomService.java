package com.swipe.service;

import com.swipe.model.Member;
import com.swipe.model.Room;
import com.swipe.model.request.UpdateRoomRequest;

import java.util.UUID;

public interface RoomService {

    Room getRoom(int roomCode);

    Room createRoom(Member member);

    Room addMemberToRoom(UpdateRoomRequest updateRoomRequest);
}
